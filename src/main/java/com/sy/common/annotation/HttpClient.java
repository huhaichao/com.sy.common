/**
 * 
 */
package com.sy.common.annotation;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//import org.springframework.web.multipart.MultipartFile;

public class HttpClient {


    public String sendGet(String url, Map<String, String> parameters, Map<String, String> heards) {
        String content = null;
        if (parameters != null && !parameters.isEmpty()) {
            Iterator<Entry<String, String>> it = parameters.entrySet().iterator();
            StringBuffer str = new StringBuffer();
            int i = 0;
            while (it.hasNext()) {
                Entry<String, String> en = it.next();
                if (i != 0) {
                    str.append("&");
                }
                str.append(en.getKey());
                str.append("=");
                str.append(en.getValue());
                i++;
            }
            content = str.toString();
        }
        return this.send(url, content, heards, "GET");
    }

    public String send(String url, String content, Map<String, String> heards, String method) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        method = (method == null || method.trim().equals("")) ? "POST" : method;
        HttpURLConnection conn = null;
        try {
            if ("GET".equalsIgnoreCase(method) && content != null) {
                url = url + "?" + content;
            }
//            URL realUrl = new URL(URLEncoder.encode(url,"UTF-8"));
            URL realUrl = new URL(url);
            conn = (HttpURLConnection) realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
            conn.setRequestProperty("Accept-Charset", "utf-8");
            conn.setRequestProperty("ContentType", "utf-8");
            conn.setRequestProperty("_internalAccess", "true");

            if (heards != null) {
                Iterator<Entry<String, String>> it = heards.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, String> en = it.next();
                    conn.setRequestProperty(en.getKey(), en.getValue());
                }
            }

            conn.setRequestMethod(method);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            if (method.equalsIgnoreCase("POST") && content != null) {
                out = new PrintWriter(conn.getOutputStream());
                out.print(content);
                out.flush();
            }
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line ;
            }
        } catch (Throwable e) {
            handeException(conn, url, e);
        } finally {

            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            releaseHttpConnection(conn);
        }
        try {
			result = URLDecoder.decode(result,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return result;
    }
    public String sendPost(String url, String content, Map<String, String> heards) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        HttpURLConnection conn = null;
        try {
            URL realUrl = new URL(url.trim());
            conn = (HttpURLConnection) realUrl.openConnection();
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "aplication/x-www-form-urlencoded");
            conn.setRequestProperty("Charset", "utf-8");
            conn.setRequestProperty("ContentType", "utf-8");
            conn.setRequestProperty("_internalAccess", "true");

            if (heards != null) {
                Iterator<Entry<String, String>> it = heards.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, String> en = it.next();
                    conn.setRequestProperty(en.getKey(), en.getValue());
                }
            }

            conn.setRequestMethod("POST");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            if (content !=null && !"".equals(content.trim())){
            	out = new PrintWriter(conn.getOutputStream());
            	out.print(URLEncoder.encode(content,"UTF-8"));
            	out.flush();
            }
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result +=line ;
            }
        } catch (Throwable e) {
            handeException(conn, url, e);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            releaseHttpConnection(conn);
        }
        try {
			result = URLDecoder.decode(result,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        return result;
    }
    
    //------------------------------
	 public String sendPost(String url, String param) {
		// System.out.println(System.getProperty("file.encoding"));
		  PrintWriter out = null;
	      BufferedReader in = null;
	      String result = "";
	      try {
	          URL realUrl = new URL(url);
	          // 打开和URL之间的连接
	          URLConnection conn = realUrl.openConnection();
	          // 设置通用的请求属性
	          conn.setRequestProperty("accept", "*/*");
	          conn.setRequestProperty("connection", "Keep-Alive");
	          conn.setRequestProperty("user-agent",
	                  "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
	          // 发送POST请求必须设置如下两行
	          conn.setDoOutput(true);
	          conn.setDoInput(true);
	          // 获取URLConnection对象对应的输出流
	          out = new PrintWriter(conn.getOutputStream());
	          // 发送请求参数
	          if(param!=null){
	          out.print(param);
	          }
	          // flush输出流的缓冲
	          out.flush();
	          // 定义BufferedReader输入流来读取URL的响应
	          in = new BufferedReader(
	                  new InputStreamReader(conn.getInputStream()));
	          String line;
	          while ((line = in.readLine()) != null) {
	              result += line;
	          }
	          
	          //result =URLDecoder.decode(result,"UTF-8");
	      } catch (Exception e) {
	          System.out.println("发送 POST 请求出现异常！"+e);
	          e.printStackTrace();
	      }
	      //使用finally块来关闭输出流、输入流
	      finally{
	          try{
	              if(out!=null){
	                  out.close();
	              }
	              if(in!=null){
	                  in.close();
	              }
	          }
	          catch(IOException ex){
	              ex.printStackTrace();
	          }
	      }
	      return  result;
	  }    
   //------------------------------
    public InputStream sendPostByStream(String url, String content, Map<String, String> heards) {
        //PrintWriter out = null;
        InputStream in = null;
        HttpURLConnection conn = null;
        try {
            URL realUrl = new URL(url);
            conn = (HttpURLConnection) realUrl.openConnection();
            //conn.setRequestProperty("accept", "*/*");
           /* conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            conn.setRequestProperty("Content-Type", "aplication/x-www-form-urlencoded");
            conn.setRequestProperty("Charset", "utf-8");
            conn.setRequestProperty("ContentType", "utf-8");
            conn.setRequestProperty("_internalAccess", "true");*/

            /*if (heards != null) {
                Iterator<Entry<String, String>> it = heards.entrySet().iterator();
                while (it.hasNext()) {
                    Entry<String, String> en = it.next();
                    conn.setRequestProperty(en.getKey(), en.getValue());
                }
            }

            conn.setRequestMethod("POST");
            // 发送POST请求必须设置如下两行
            
            
            if (content !=null && !"".equals(content.trim())){
            	out = new PrintWriter(conn.getOutputStream());
            	out.print(URLEncoder.encode(content,"UTF-8"));
            	out.flush();
            }*/
            
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.connect();
            in = new BufferedInputStream(conn.getInputStream());
            
        } catch (Throwable e) {
            handeException(conn, url, e);
        } finally {
            /*if (out != null) {
			    out.close();
			}*/
            releaseHttpConnection(conn);
        }
        
        return in;
    }
    private void handeException(HttpURLConnection conn, String url, Throwable e) {
        BufferedInputStream bis = null;
        String result = null;
        try {
            if (e instanceof MalformedURLException) {
                result = "地址[" + url + "]格式不正确！";
            } else if (conn != null && conn.getResponseCode() >= 500) {
                bis = new BufferedInputStream(conn.getErrorStream());
                result = inputStream2String(bis);
            } else if (conn != null && conn.getResponseCode() == 404) {
                result = "404-[地址" + url + "不正确]！";
            } else {
                result = e.getMessage();
            }
        } catch (Throwable e1) {
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e1) {
                }
            }
        }
        System.out.println("请求http地址[" + url + "]失败：" + result);
    }

    private String inputStream2String(InputStream is) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
    }

    /**
     * 正确释放httpconnection 
     * @param con
     */
    public static void releaseHttpConnection(HttpURLConnection con) {
        if (con != null) {
            try {
                con.getInputStream().close();
            } catch (Throwable e) {
            }
            try {
                con.getErrorStream().close();
            } catch (Throwable e) {
            }
            try {
                con.disconnect();
            } catch (Throwable e) {
            }
        }
    }
    /**
     * 得到post提交的参数值
     * @param parameters
     */
    public static String getContent(Map<String, String> parameters){
    	String content = null;
        if (parameters != null && !parameters.isEmpty()) {
            Iterator<Entry<String, String>> it = parameters.entrySet().iterator();
            StringBuffer str = new StringBuffer();
            int i = 0;
            while (it.hasNext()) {
                Entry<String, String> en = it.next();
                if (i != 0) {
                    str.append("&");
                }
                str.append(en.getKey());
                str.append("|@#");
                str.append(en.getValue());
                i++;
            }
            content = str.toString();
        }
        return content;
    }
}
