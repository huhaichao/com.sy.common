package com.sy.common.enums;

public enum MessageCodeConstant {
	
	 SUCESSS ("1","处理成功"),
	 
	 EXCEPTION("2","数据操作异常，请联系后台开发人员"),//通用异常处理 信息，状态表中需维护

	 PHONENUBMER_EXIST ("100","手机已经注册"),
	 NO_LOGIN("101","用户未登录"),
	 NOINFO_USERID("102","没有上送userId"),
	 NOINFO_LOGINKEY("103","没有上送loginKey"),
	 //300-310 作为七牛云的返回码定义
	 QINIUYUN_UPLOADTOKEN("300","获取token成功"),
	 
	 //发布明细
	 DETAIL_PUBLISH_NULL("228","获取数据为空"),
	 DETAIL_PUBLISH_SUCCESS("229","获取数据成功"),
	 DETAIL_PUBLISH_ERROR("230","获取数据出错"),
	 
	 //发布人物消息
	 PUBLISH_PEOPLE_ADD_SUCCESS("170","发布人物成功"),
	 PUBLISH_PEOPLE_UPDATE_SUCCESS("171","更新人物成功"),
	 PUBLISH_PEOPLE_ERROR("172","发布人物失败"),
	 
	 //发布物品消息
	 PUBLISH_ITEM_ADD_SUCCESS("160","发布物品成功"),
	 PUBLISH_ITEM_UPDATE_SUCCESS("161","更新物品成功"),
	 PUBLISH_ITEM_ERROR("162","发布物品失败"),
	 
	 //删除发布消息
	 DELETE_MESSAGE_SUCCESS("190","删除发布信息成功"),
	 DELETE_MESSAGE_NULL("191","无发布信息可删除"),
	 DELETE_MESSAGE_ERROR("192","删除发布信息失败"),
	 
	 //发布消息列表（发布/收藏/帮助）
	 LIST_MESSAGE_SUCCESS("228","查询发布列表信息成功"),
	 LIST_MESSAGE_ERROR("227","查询发布列表信息失败"),
	
	 //320-350作为支付宝操作接口
	 ALIPAY_PAY_DOPAYSUCCESS("320","支付宝下单组参成功"),
	 ALIPAY_PAY_DOPAYERROR("324","支付宝下单组参失败"),
	 ALIPAY_PAY_COMPELET("321","支付宝状态修改成功"),
	 ALIPAY_PAY_CHECKSIGNERROR("322","支付宝验证签名失败"),
	 ALIPAY_PAY_PAYSUCCESS("323","支付宝支付成功"),
	 
	 /***支付宝同步通知原生状态码  与  内部状态码转换 比较安全***/
	 ALIPAY_9000 ("323","支付宝支付成功"),
	 ALIPAY_8000 ("325","支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态"),
	 ALIPAY_6004 ("325","支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态"),
	 ALIPAY_PAY_PAYNORESULT("325","支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态"),
	 ALIPAY_6002("326","支付宝支付结果 支付网络连接出错"),
	 ALIPAY_6001 ("327","支付宝支付结果  用户中途取消"),
	 ALIPAY_5000 ("328","支付宝支付结果  重复请求"),
	 ALIPAY_4000 ("329","支付宝支付结果  订单支付失败"),
	 
	 //微信API原生异常类型转换
	 WECHAT_PAY_NOAUTH("600","商户无此接口权限"),
	 WECHAT_PAY_NOTENOUGH("601","余额不足"),
	 WECHAT_PAY_ORDERPAID("602","商户订单已支付"),
	 WECHAT_PAY_ORDERCLOSED("603","订单已关闭"),
	 WECHAT_PAY_SYSTEMERROR("604","系统异常，请用相同参数重新调用"),
	 WECHAT_PAY_APPID_NOT_EXIST("605","APPID不存在"),
	 WECHAT_PAY_MCHID_NOT_EXIST("606","MCHID不存在"),
	 WECHAT_PAY_APPID_MCHID_NOT_MATCH("607","appid和mch_id不匹配"),
	 WECHAT_PAY_LACK_PARAMS("608","缺少必要的请求参数"),
	 WECHAT_PAY_OUT_TRADE_NO_USED("609","同一笔交易不能多次提交"),
	 WECHAT_PAY_SIGNERROR("610","参数签名结果不正确"),
	 WECHAT_PAY_XML_FORMAT_ERROR("611","XML格式错误"),
	 WECHAT_PAY_REQUIRE_POST_METHOD("612","请检查请求参数是否通过post方法提交"),
	 WECHAT_PAY_POST_DATA_EMPTY("613","请检查post数据是否为空"),
	 WECHAT_PAY_NOT_UTF8("614","编码格式错误	"),
	 
	 WECHAT_PAY_SUCCESS("620","接受返回报文成功"),
	 WECHAT_PAY_ERROR("621","接受返回报文失败"),
	 //支付宝微信验签失败
	 PAY_SIGNERROR("330","上送报文延签失败"),
	 PAY_EXCEPTION("340","支付宝微信 异常"),
	 PAYWAY_SEARCHSUCCESS("341","支付方式查询 成功"),
	 
	 //支付宝公共返回码
	 ALIPAY_10000 ("342","支付宝 请求成功"),
	 ALIPAY_20000 ("343","支付宝 服务不可用"),
	 ALIPAY_20001 ("344","支付宝 授权权限不足"),
	 ALIPAY_40001 ("345","支付宝 缺少必选参数"),
	 ALIPAY_40002 ("346","支付宝 非法的参数"),
	 ALIPAY_40004 ("347","支付宝 业务处理失败"),
	 ALIPAY_40006 ("348","支付宝 权限不足"),
	 
	 //我的消息列表信息返回码
	 PUSH_MSG_LIST_SUCCESS("400","获取推送消息列表成功"),
	 PUSH_MSG_LIST_ERROR("401","获取推送消息列表失败"),
	 //我的消息明细信息返回码
	 PUSH_MSG_DETIAL_SUCCESS("402","获取推送消息明细成功"),
	 PUSH_MSG_DETIAL_ERROR("403","获取推送消息明细失败"),
	 //我的消息删除信息返回码
	 PUSH_MSG_DEL_SUCCESS("404","删除推送消息列表成功"),
	 PUSH_MSG_DEL_ERROR("405","删除推送消息列表失败"),
	 //我的消息更新信息返回码
	 PUSH_MSG_UPDATE_SUCCESS("406","更新推送消息读取状态成功"),
	 PUSH_MSG_UPDATE_ERROR("407","更新推送消息不存在"),
	 PUSH_MSG_UPDATE_EXCEPTION("399","更新推送消息读取状态异常"),

	 //我的收藏列表信息返回码
	 COLLECT_MSG_LIST_SUCCESS("408","获取收藏消息列表成功"),
	 COLLECT_MSG_LIST_ERROR("409","获取收藏消息列表失败"),
	 //我的收藏明细信息返回码
	 COLLECT_MSG_DETIAL_SUCCESS("410","获取收藏消息明细成功"),
	 COLLECT_MSG_DETIAL_ERROR("411","获取收藏消息明细失败"),
	 //我的收藏信息返回码
	 COLLECT_MSG_ADD_SUCCESS("412","收藏消息成功"),
	 COLLECT_MSG_ADD_ERROR("413","收藏消息失败"),
	 //我的收藏删除信息返回码
	 COLLECT_MSG_DEL_SUCCESS("414","删除收藏消息列表成功"),
	 COLLECT_MSG_DEL_ERROR("415","删除收藏消息列表失败"),
	
	
	 //420-429作为积分详情接口状态吗Credit  wl
     CREDIT_GET_LIST_SUCCESS("420","获取积分信息列表成功"),
     CREDIT_GET_LIST_FALI("421","没有获取积分列表信息"),
     CREDIT_LIST_EXCEPTION("422","获取积分信息列表发生异常"),
	

     //430-435作为拾物详情接口状态吗 wl
	 DETAIL_GET_SUCCESS("430","获取物品详情信息成功"),
	 DETAIL_GET_FAIL("431","没有获取到相应物品信息"),
	
	 DETAIL_GET_PEOPLE_SUCCESS("432","获取人员信息成功"),
	 DETAIL_GET_PEOPLE_FAIL("433","没有获取到相应人员信息"),
	
	 DETAIL_BET_INFORMATION_STATUS("434","接口发布类型不正确"),//0 拾物  1 失物   2 失 人
	 DETAIL_EXCEPTION("435","拾物信息数据操作异常，请联系后台开发人员"),//通用异常处理 信息，状态表中需维护

	 //440-442  WL
	 EXIT_MSG_SUCCESS("440","退出系统成功"),
	 EXIT_MSG_ERROR("441","退出系统失败"),
	 EXIT_MSG_EXCEPTION("442","退出系统异常"),
	 //443-445  WL
	 PAY_MSG_SUCCESS("443","设置支付密码成功"),
	 PAY_MSG_ERROR("444","用户不存在"),
	 PAY_MSG_EXCEPTION("445","设置支付密码异常"),
	 //446-448  WL
	 ALTER_PAY_MSG_SUCCESS("446","修改支付密码成功"),
	 ALTER_PAY_MSG_ERROR("447","修改支付密码失败"),
	 ALTER_PAY_MSG_EXCEPTION("448","修改支付密码异常"),
	 //449-451  WL
	 ALTER_USER_PHONE_SUCCESS("449","修改绑定手机号成功"),
	 ALTER_USER_PHONE_ERROR("450","用户信息不存在"),
	 ALTER_USER_PHONE_EXCEPTION("451","修改绑定手机号异常"),
	 //449-451  WL
	 ACTIVE_MESSAGE_SUCCESS("452","激活消息信息成功"),
	 ACTIVE_MESSAGE_ERROR("453","消息信息不存在"),
	 ACTIVE_MESSAGE_EXCEPTION("454","激活消息信息异常"),
 	 //500-519作为后续消息数据
	 DEL_MESSAGE_SUCCESS("500","消息删除成功！"),
	 DEL_MESSAGE_FALI("501","没有可更新的数据！"),
	 DEL_MESSAGE_ERRO("502","删除数据异常"),
	  
	  
	  

	  //用户之间的交易 消息码520 -- 530 
	  TREAD_ACCOUNTEXCEPTION("520","对方账户 有问题或者没有开通"),
	  TREAD_ACCOUNTBALANCENOMENOY("521","你的账户余额不足"),
	  TREAD_SUCCESS("522","交易成功"),
	  TREAD_TREADPASSWORDFAIL("523","消息口令无效"),
	  ;
	  
	 private  String resultCode ;
	 
	 private  String resultMessage;
	 
	 
	private MessageCodeConstant(String resultCode ,String resultMessage) {
		this.resultMessage = resultMessage;
		this.resultCode = resultCode;
	}


	public String getResultCode() {
		return resultCode;
	}


	public String getResultMessage() {
		return resultMessage;
	}
	 
}
