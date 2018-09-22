package com.sy.common.bean.AppPayWechatBean;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 参照 https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_1
 * 所撰写的统一下单实体类
 *
 */
@JacksonXmlRootElement(localName = "xml")
@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect
public class UnifiedOrder extends WechatPaySignable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4990302734672853683L;

	static final String FEE_TYPE = "CNY";
	static final String TRADE_TYPE = "APP";
	static final String WX_DATE_FORMAT = "yyyyMMddHHmmss";
	
	public UnifiedOrder() {
		this.fee_type = FEE_TYPE;
		this.trade_type = TRADE_TYPE;
	}

	// 公众账号ID
	private String appid;
	// 商户号
	private String mch_id;
	// 设备号
	private String device_info;
	// 随机字符串
	private String nonce_str;
	// 商品描述
	private String body;
	// 商品详情
	private String detail;
	// 附加数据
	private String attach;
	// 商户订单号
	private String out_trade_no;
	// 货币类型
	private String fee_type;
	// 总金额
	private Integer total_fee;
	// 终端IP
	private String spbill_create_ip;
	// 交易起始时间
	private String time_start;
	// 交易结束时间订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。其他详见时间规则.注意：最短失效时间间隔必须大于5分钟;
	private String time_expire;
	// 商品标记
	private String goods_tag;
	// 通知地址
	private String notify_url;
	// 交易类型
	private String trade_type;
	// 商品ID
	private String product_id;
	// 指定支付方式
	private String limit_pay;
	// 用户标识
	private String openid;

	public String getAppid() {
		return appid;
	}

	public UnifiedOrder setAppid(String appid) {
		this.appid = appid;
		return this;
	}

	public String getMch_id() {
		return mch_id;
	}

	public UnifiedOrder setMch_id(String mch_id) {
		this.mch_id = mch_id;
		return this;
	}

	public String getDevice_info() {
		return device_info;
	}

	public UnifiedOrder setDevice_info(String device_info) {
		this.device_info = device_info;
		return this;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public UnifiedOrder setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
		return this;
	}

	public String getBody() {
		return body;
	}

	public UnifiedOrder setBody(String body) {
		this.body = body;
		return this;
	}

	public String getDetail() {
		return detail;
	}

	public UnifiedOrder setDetail(String detail) {
		this.detail = detail;
		return this;
	}

	public String getAttach() {
		return attach;
	}

	public UnifiedOrder setAttach(String attach) {
		this.attach = attach;
		return this;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public UnifiedOrder setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
		return this;
	}

	public String getFee_type() {
		return fee_type;
	}

	public UnifiedOrder setFee_type(String fee_type) {
		this.fee_type = fee_type;
		return this;
	}

	public Integer getTotal_fee() {
		return total_fee;
	}

	public UnifiedOrder setTotal_fee(Integer total_fee) {
		this.total_fee = total_fee;
		return this;
	}

	public String getSpbill_create_ip() {
		return spbill_create_ip;
	}

	public UnifiedOrder setSpbill_create_ip(String spbill_create_ip) {
		this.spbill_create_ip = spbill_create_ip;
		return this;
	}

	public String getTime_start() {
		return time_start;
	}

	public UnifiedOrder setTime_startByDate(Date time_start) {
		this.time_start = new SimpleDateFormat(WX_DATE_FORMAT).format(time_start);
		return this;
	}
	
	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}

	public void setTime_expire(String time_expire) {
		this.time_expire = time_expire;
	}

	@JsonIgnore
	public Date getTime_startAsDate() {
		Date date = new Date();
		try {
			date = new SimpleDateFormat(WX_DATE_FORMAT).parse(time_start);
		} catch (ParseException e) {
           throw new IllegalArgumentException("Wrong input :" + time_start + ", expected " + WX_DATE_FORMAT, e);
		}
		return date;
	}
	
	@JsonIgnore
	public Date getTime_expireAsDate() {
		Date date = new Date();
		try {
			date = new SimpleDateFormat(WX_DATE_FORMAT).parse(time_expire);
		} catch (ParseException e) {
           throw new IllegalArgumentException("Wrong input :" + time_expire + ", expected " + WX_DATE_FORMAT, e);
		}
		return date;
	}
	
	public String getTime_expire() {
		return time_expire;
	}

	public UnifiedOrder setTime_expireByDate(Date time_expire) {
		this.time_expire = new SimpleDateFormat(WX_DATE_FORMAT).format(time_expire);
		return this;
	}

	public String getGoods_tag() {
		return goods_tag;
	}

	public UnifiedOrder setGoods_tag(String goods_tag) {
		this.goods_tag = goods_tag;
		return this;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public UnifiedOrder setNotify_url(String notify_url) {
		this.notify_url = notify_url;
		return this;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public UnifiedOrder setTrade_type(String trade_type) {
		this.trade_type = trade_type;
		return this;
	}

	public String getProduct_id() {
		return product_id;
	}

	public UnifiedOrder setProduct_id(String product_id) {
		this.product_id = product_id;
		return this;
	}

	public String getLimit_pay() {
		return limit_pay;
	}

	public UnifiedOrder setLimit_pay(String limit_pay) {
		this.limit_pay = limit_pay;
		return this;
	}

	public String getOpenid() {
		return openid;
	}

	public UnifiedOrder setOpenid(String openid) {
		this.openid = openid;
		return this;
	}

	@Override
	public String toString() {
		return "UnifiedOrder [appid=" + appid + ", mch_id=" + mch_id
				+ ", device_info=" + device_info + ", nonce_str=" + nonce_str
				+ ", body=" + body + ", detail=" + detail + ", attach="
				+ attach + ", out_trade_no=" + out_trade_no + ", fee_type="
				+ fee_type + ", total_fee=" + total_fee + ", spbill_create_ip="
				+ spbill_create_ip + ", time_start=" + time_start
				+ ", time_expire=" + time_expire + ", goods_tag=" + goods_tag
				+ ", notify_url=" + notify_url + ", trade_type=" + trade_type
				+ ", product_id=" + product_id + ", limit_pay=" + limit_pay
				+ ", openid=" + openid + "," + super.toString() + "]";
	}
}