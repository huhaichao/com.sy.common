package com.sy.common.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import org.apache.http.HttpStatus;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sy.common.bean.AppPayWechatBean.HttpConfig;

public class HttpClientUtil {




		private static final Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);	

		private static PoolingHttpClientConnectionManager cm = null;	
		static{
			 LayeredConnectionSocketFactory sslsf = null;
		        try {
		            sslsf = new SSLConnectionSocketFactory(SSLContext.getDefault());
		        } catch (NoSuchAlgorithmException e) {
		            e.printStackTrace();
		        }
		        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
		                .register("https", sslsf)
		                .register("http", new PlainConnectionSocketFactory())
		                .build();
		        cm =new PoolingHttpClientConnectionManager(socketFactoryRegistry);
		        cm.setMaxTotal(500);
		        cm.setDefaultMaxPerRoute(20);
		}
		
		 public static CloseableHttpClient getHttpClient() {       
		        CloseableHttpClient httpClient = HttpClients.custom()
		                .setConnectionManager(cm)
		                .build();          
		        
		        return httpClient;
		    }


		/**
		 * POST提交表单,对参数进行URLEncoder操作
		 * @param url
		 * @param param
		 * @param connectionTimeOut
		 * @param socketTimeOut
		 * @return
		 */
		@SuppressWarnings("rawtypes")
		public static String httpPost(String url, String param, int connectionTimeOut, int socketTimeOut) {
			CloseableHttpResponse response = null;
			//int statusCode = 0;
			CloseableHttpClient httpclient = null;
			String responseStr = "";
			try {
				logger.info("httpPost url " + url);
				HttpPost httpPost = new HttpPost(url);
				String charset = null;
				if(!StringUtils.isEmpty(param)){
					List<NameValuePair> nvps = new ArrayList<NameValuePair>();
					JSONObject json = JSONObject.fromObject(param);
					charset = json.getString("charset");
					json.remove("charset");
					Iterator iterator = json.keys();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						String value = json.getString(key);
						//添加转码
						nvps.add(new BasicNameValuePair(key, URLEncoder.encode(value, charset)));
					}
					httpPost.setEntity(new UrlEncodedFormEntity(nvps, charset));
				}
				RequestConfig rc = httpPost.getConfig();
				rc = (rc == null) ? RequestConfig.custom().build() : rc;
				/** 设置超时时间为5秒 */
				rc = RequestConfig.copy(rc).setConnectTimeout(connectionTimeOut).setSocketTimeout(socketTimeOut).build();
				httpPost.setConfig(rc);
				httpclient= getHttpClient(); 
				response = httpclient.execute(httpPost);
					HttpEntity entity = response.getEntity();
					if(entity != null){
						responseStr = EntityUtils.toString(entity,charset);
					}
					EntityUtils.consume(entity);
			} catch (Exception e) {
				logger.error("httpPost url " + url + " error " + e);
				e.printStackTrace();
			} finally {
				try {
					if (response != null) {
						response.close();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
					logger.error("httpPost url " + url + " response close error " + e1);
				}
			}
			return responseStr;
		}

		/**
		 * GET请求
		 * @param url	资源URL
		 * @param connectionTimeOut	HTTP连接超时时间
		 * @return HTTP响应码
		 */
		public static int httpGet(String url, int connectionTimeOut, int socketTimeOut) {
			CloseableHttpResponse response = null;
			int ret = 0;
			HttpGet httpGet = null;
			try {
				CloseableHttpClient httpclient = getHttpClient(); 
				httpGet = new HttpGet(url);
				logger.info("httpGet url " + url + " by connectionTimeOut=" + connectionTimeOut + "&socketTimeOut=" + socketTimeOut);
				RequestConfig rc = httpGet.getConfig();
				rc = (rc==null)?RequestConfig.custom().build():rc;
				
				rc = RequestConfig.copy(rc).setSocketTimeout(connectionTimeOut).setConnectTimeout(socketTimeOut).build();
				httpGet.setConfig(rc);
				response = httpclient.execute(httpGet);
				ret = response.getStatusLine().getStatusCode();
			} catch (Exception e) {
				logger.error("httpGet url " + url + " error " + e);
				e.printStackTrace();
			} finally {
				try {
					if(response != null){
						response.close();
					}
					if(httpGet != null)
						httpGet.releaseConnection();
				} catch (IOException e1) {
					e1.printStackTrace();
					logger.error("httpGet url " + url + " response close error " + e1);
				}
			}
			return ret;
		}
		
		/**
		 * 指令中心用到此方法
		 * 
		 * @param req
		 * @param url
		 * @return
		 */
		/*public static CommandInfo callHttpService(String req, String url) {
			CommandInfo ret = new CommandInfo();
			CommandInfoRet retr = new CommandInfoRet();
			// 创建默认的httpClient实例.
			//CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpClient httpclient = getHttpClient();
			CloseableHttpResponse response = null;
			HttpPost httppost =null;
			try {

				// 创建httppost
				httppost = new HttpPost(url);
				// 创建参数队列
				List<NameValuePair> formparams = new ArrayList<NameValuePair>();
				Map<String, String> para = new HashMap<String, String>();
				para.put("req", req);

				for (String key : para.keySet())
					formparams.add(new BasicNameValuePair(key, para.get(key)));

				UrlEncodedFormEntity uefEntity;

				uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
				httppost.setEntity(uefEntity);

				logger.info("executing request " + httppost.getURI());
				
				RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(Integer.parseInt(waitMscc)).setConnectTimeout(Integer.parseInt(waitMscc)).build();//设置请求和传输超时时间
				httppost.setConfig(requestConfig);
				
				response = httpclient.execute(httppost);
				ObjectMapper mapper = new ObjectMapper();
				ret = mapper.readValue(EntityUtils.toString(response.getEntity()),
						CommandInfo.class);

			} catch (Exception e) {
				e.printStackTrace();
				retr.setRetcode(RetCode.OUTTER_ERROR.getValue());
				retr.setRetmsg("转发请求时异常！");
				ret.setCr(retr);
			} finally {
				// 关闭连接,释放资源
				try {
					if(response!=null)
						response.close();
					if(httppost!=null)
						httppost.abort();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return ret;
		}*/
		


		/**
		 * post方式提交表单（模拟用户登录请求）
		 */
		public void postForm() {

		}

		/**
		 * 向目标地址发送一个json
		 * 
		 * @param url
		 * @param para
		 * @return
		 * @throws UnsupportedEncodingException
		 */
		public static int post(String url, Map<String, String> para) {
			int ret = 0;
			// 创建默认的httpClient实例.
			CloseableHttpClient httpclient = HttpClients.createDefault();
			try {

				// 创建httppost
				HttpPost httppost = new HttpPost(url);

				// 创建参数队列
				List<NameValuePair> formparams = new ArrayList<NameValuePair>();

				for (String key : para.keySet())
					formparams.add(new BasicNameValuePair(key, para.get(key)));

				UrlEncodedFormEntity uefEntity;

				uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
				httppost.setEntity(uefEntity);

				logger.info("executing request " + httppost.getURI());
				CloseableHttpResponse response = httpclient.execute(httppost);
				try {
					ret = response.getStatusLine().getStatusCode();
				} finally {
					response.close();
				}
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				// 关闭连接,释放资源
				try {
					httpclient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return ret;
		}
	    
		/**
		 * post 提交
		 * @param url
		 * @param param
		 * @param connectionTimeOut
		 * @param socketTimeOut
		 * @return
		 */
		public static String httpPostNew(String url, String param, int connectionTimeOut, int socketTimeOut) {
			CloseableHttpResponse response = null;
			CloseableHttpClient httpclient = null;
			String responseStr = "";
			try {
				logger.info("httpPost url " + url);
				HttpPost httpPost = new HttpPost(url);
				String charset = null;
				
				/** 设置参数*/
				if(!StringUtils.isEmpty(param)){
					List<NameValuePair> nvps = new ArrayList<NameValuePair>();
					JSONObject json = JSONObject.fromObject(param);
					Iterator iterator = json.keys();
					while (iterator.hasNext()) {
						String key = (String) iterator.next();
						String value = json.getString(key);
						nvps.add(new BasicNameValuePair(key, value));
					}
					/*设置表单参数格式为UTF-8*/
					UrlEncodedFormEntity uefEntity;
					uefEntity = new UrlEncodedFormEntity(nvps, "UTF-8");
					httpPost.setEntity(uefEntity);	
				}
				RequestConfig rc = httpPost.getConfig();
				rc = (rc == null) ? RequestConfig.custom().build() : rc;
				/** 设置超时时间为5秒 */
				rc = RequestConfig.copy(rc).setConnectTimeout(connectionTimeOut).setSocketTimeout(socketTimeOut).build();
				httpPost.setConfig(rc);
				httpclient= getHttpClient(); 
				response = httpclient.execute(httpPost);
			
				HttpEntity entity = response.getEntity();
				if(entity != null){
					responseStr = EntityUtils.toString(entity,charset);
				}
				EntityUtils.consume(entity);
			} catch (Exception e) {
				logger.error("httpPost url " + url + " error " + e);
				e.printStackTrace();
			} finally {
				try {
					if (response != null) {
						response.close();
					}
					if(httpclient!=null){
						httpclient.close();
					}
				} catch (IOException e1) {
					e1.printStackTrace();
					logger.error("httpPost url " + url + " response close error " + e1);
				}
			}
			return responseStr;
		}
		
		public static void main(String[]args){
	        JSONObject  json  = new JSONObject();
			
			System.out.println(HttpClientUtil.httpPostNew("http://127.0.0.1:8144/iposbusi/main/sign",json.toString(),50000,50000));
		}
		
		/**
		 * 用于向微信发送请求text/xml
		 * @param url
		 * @param body
		 * @return
		 * @throws IOException
		 */
		public String sendHttpPostAndReturnString(String url, String body,HttpConfig httpConf)
				throws IOException {
			logger.trace("Sending POST to URL {}", url);
			CloseableHttpClient httpclient = null;
			String responseText = null;
			CloseableHttpResponse response = null;
			PoolingHttpClientConnectionManager connMgr = new PoolingHttpClientConnectionManager();
			try {
				/*--------初始化参数---------*/
				connMgr.setMaxTotal(httpConf.numberOfConnections);
				if (httpConf.timeOutInSeconds > 0) {
					RequestConfig requestConfig = RequestConfig
							.custom()
							.setSocketTimeout(httpConf.timeOutInSeconds * 1000)
							.setConnectTimeout(httpConf.timeOutInSeconds * 1000)
							.setConnectionRequestTimeout(
									httpConf.timeOutInSeconds * 1000).build();
					httpclient = HttpClients.custom().setConnectionManager(connMgr)
							.setDefaultRequestConfig(requestConfig).build();
				} else {
					httpclient = HttpClients.custom().setConnectionManager(connMgr)
							.build();
				}
				/*--------初始化参数---------*/
				
				HttpPost postRequest = new HttpPost(url);
				postRequest.setHeader("Content-Type", "text/xml;charset=utf-8");
				StringEntity postEntity = new StringEntity(body,Charset.forName("UTF-8"));
				postRequest.setEntity(postEntity);
				response = httpclient.execute(postRequest);
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					throw new IOException("Received not 200 OK status code:"
							+ response.getStatusLine().toString());
				}
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					responseText = EntityUtils.toString(entity, "UTF-8");
					logger.debug("Received Unified Order resposne from wechat: "
							+ responseText);
					return responseText;
				} else {
					return null;
				}
			} finally {
				if (response != null) {
					response.close();
				}
				if(httpclient!=null){
					httpclient.close();
				}
			}
		}

}
