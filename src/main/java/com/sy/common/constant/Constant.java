package com.sy.common.constant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Constant {
	
	//缓存key前缀
	public static final String CACHELOGINKEY="SY_CACHE_LOGIN_KEY";
	//緩存key钱包
	public static final String SIGNKEY="SY_CACHE_SIGN_KEY";
	//永久缓存
	public static final String FOREVERCACHE="forevercache";
	//600s缓存
	public static final String DAYSCACHE ="dayscache";
	
	//七牛云 权限ak
	public final static String ACCESSKEY ="fSnGroWa_RuYVEocU8lBVYECX0fKy0vSj6Mlm0Pg";
	//七牛云 权限私钥
	public final static String SECRETKEY ="cYfS5zyE-3jFE5u7CamnTqs-x2lgJDcwkMOzU8Fm";
	//七牛云 存储空间
	public final static String BUCKETNAME = "shiyuan";
	//七牛云 下载外链
	public final static String DOWLOADBASEURL = "http://onw1xwgnt.bkt.clouddn.com/";
	
	//支付宝 gateWay
	public final  static  String ALIPAY_URL="https://openapi.alipaydev.com/gateway.do"; //沙箱测试
	//支付宝 APP_ID
	public final  static  String ALIPAY_APP_ID="2016080500176796";
	//支付宝 APP_PRIVATE_KEY
	public final  static  String ALIPAY_APP_PRIVATE_KEY="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCq6TpVrc5SYdua2QvRGSTnK+r8fZh80/bDEm2MOQkusKvvjRh6uybBOrBxa+BCUBVlqqS45drx1ra2zH+lXshEttV+G+qjYxoF4wAAHlcKBAoDFiZ5a/X0yJgqfYJaVyg7sES1Nt5qXRtSvJHKWo+5eQ5GLB73G+DTqOrG4NQ1Yer26OaTsS8zC5z/aRVlOB59okytqYrjpBZLy/cbJy703t19litOj4TtmiX8Cv1Wq5Bs6x/9lc9xgnmDfdwVitO+Cbp85EHvbfcihnhhGmpeM90k2vbIwygQP1vShSmkSX9x4LRjLZOvXtpFwgTyvutnQpYdBr4ve6JuUtuIdTdhAgMBAAECggEAbvDX4ffhXs6Qy3IqXn+w2bJDZcRtMFIy8qtKmuQHFtytruDqy/giDvn2wJkiyEjNquHa7P6fYa5biksybHkbDKeV67dZVtekc7/HJ0yKeUDn8tr0/Ipc7JktVR+Fdvjub9hasTq9o1NuwgUPqcehVebDoj9Pll3tUddrFs+oUEGAvr9TDbI2M3cfvamzPXJqRfZIPJhcoNuJE3JTk74MwJMAIZz5uXeU+/EJVANtgrWuuSCTxER64rXFylH86qlaOBhvlmnDbW+rU4b74enRNaBjF7lNABIdsZ7RfgxCpp7glmhMiGmopX/dSWvD+uYSrByA3ypOUpHhxma6NLAxwQKBgQDTNqLDggUjetBI950SELp210RD139AMJ/VMHzT/jt+Yj1V3svo+fGJTHlIyV5sZbuibtyj7BT0sWPYTojgxMDsDexSbt73PWViilsPhg69q81eRKySQMnFECaruXj2am+KDqNXRNZ45FtZNaqid/Z5/RBLb3wcBsE/bFsmzRLUyQKBgQDPJth9Ppe/pUGDYp0fnMozt1V+ggWTiVfH3iFqEtTIhoyC+hcgondxVTuTOk/iUWmG9s83BZ3pxQISlhQOSRo5bIs+bls2u8N6+EI7e41ZjBytiVZKuAl6wotIYI0++SnopXvGH57xowjtapFIhvZoszbmwW3V77Pwj5d6mrGR2QKBgQCzAgNAn9mrEFOnA/VjcjoWrqt0tBdtV8ie7tFc+oOBwdEqDgHUGsHTE7VXMxOL200DheIKK/Q2zoFIuobXuOmpJsO7uavO74IV2h0DMyMbLZiI5Ls92RsooV+k+zTB48NUxsM5G2aKXz/sg8dymymSiiBdTsdpGXB/SF6YrAXhwQKBgGkCYiArSLWnyiwWI1xRGNdaioZU1wrRRqRU4E9rOF5mhngm2u56LV5QPKEHoFMzvfDi0Gwt9rz4V3KgjY4oVJjjgzqkqqx2RkPh8YFBwoewVSFLS2kZHgUS9ZQ9DZzspef/a10lzmbjpLTlnrxLXkH5B022pD0dA/RgdgN6w6URAoGBAI9+7yOQR1a8RA+R7P8iuPpH4wjquiozPFvAyf6NTDYkVd/YvO7Su2JAeUDFylx+YA0yt/AAT9DDrqjGOq58NE6Ac/UDeAes2VW/pxjJjSbpR9+5LLXfPI50gkq6eAVdbn3QLHazdb+yD2uJZg+jJm8Gk6t5HQGZRfKx1WEzO4xV";
	//支付宝 ALIPAY_PUBLIC_KEY
	public final  static String  ALIPAY_PUBLIC_KEY ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAquk6Va3OUmHbmtkL0Rkk5yvq/H2YfNP2wxJtjDkJLrCr740YersmwTqwcWvgQlAVZaqkuOXa8da2tsx/pV7IRLbVfhvqo2MaBeMAAB5XCgQKAxYmeWv19MiYKn2CWlcoO7BEtTbeal0bUryRylqPuXkORiwe9xvg06jqxuDUNWHq9ujmk7EvMwuc/2kVZTgefaJMramK46QWS8v3Gycu9N7dfZYrTo+E7Zol/Ar9VquQbOsf/ZXPcYJ5g33cFYrTvgm6fORB7233IoZ4YRpqXjPdJNr2yMMoED9b0oUppEl/ceC0Yy2Tr17aRcIE8r7rZ0KWHQa+L3uiblLbiHU3YQIDAQAB"; 
	//支付宝 通知URL
	public final  static String  ALIPAY_NOTIFYURL ="http://139.129.239.115:8046/sy/server/alipay/payAsynNotify"; 
	//支付宝 产品码
	public final static  String   ALIPAY_PRODUCTCODE="1231";
	//支付宝 绑定商户ID
	public final static  String   ALIPAY_SELLERID="2088102170133521";
	//支付宝信用支付通道 pcredit--花呗 pcreditpayInstallment -- 花呗分期 creditCard--信用卡 creditCardExpress--信用卡快捷 creditCardCartoon--信用卡卡通
	//credit_group -- 信用支付类型（包含信用卡卡通、信用卡快捷、花呗、花呗分期）
	public  final static  String  ALIPAY_CREDITCHANNELS="credit_group";
	//支付宝 信用支付通道明细
	public  final static  String  ALIPAY_CREDITCHANNELSDETAILS="pcredit,pcreditpayInstallment,creditCard,creditCardExpress,creditCardCartoon";
	//支付宝常规支付类型,--推荐通道  balance--余额 moneyFund--余额宝  debitCardExpress--借记卡快捷 mcard--商户预存卡pcard -- 个人预存卡bankPay--网银
	public final static  String  ALIPAY_COMMONCHANNELS="balance,moneyFund,debitCardExpress,mcard,pcard,bankPay";
	//支付宝优惠支付类型 coupon--红包 promotion--优惠（包含实时优惠+商户优惠）voucher--营销券point--积分 mdiscount --商户优惠
	public final static  String  ALIPAY_PREFERENTIALCHANNELS="promotion,coupon,voucher,point,mdiscount";
	
	//日期格式化类常量yyyy-MM-dd hh:mm:ss
	public  final static  DateFormat  YYYY_MM_DD_HH_MM_SS= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	//日期格式化类常量yyyy-MM-dd
	public  final static  DateFormat  YYYY_MM_DD= new SimpleDateFormat("yyyy-MM-dd");
	//日期格式化类常量yyyyMMdd
	public  final static  DateFormat  YYYYMMDD= new SimpleDateFormat("yyyyMMdd");
	//推送消息未读状态
	public  final static  String PMState_N  = "0";
	//推送消息已读状态
	public  final static  String PMState_Y  = "1";
	/**
	 * 短信接口常量定义 WL
	 */
	public final static String URL = "http://api.jxt10690.com:7788/msg/";//应用地址
	public final static String ACCOUNT = "HY_Sykj";//账号
	public final static String PSWD = "HY_fbd03";//密码
	public final static String CONTENT = "您的手机动态码：str。工作人员不会向您索要，如果非本人操作请忽略。";//短信内容
	public static boolean NEEDSTATUS = true;//是否需要状态报告，需要true，不需要false

}
