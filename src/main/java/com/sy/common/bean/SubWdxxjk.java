package com.sy.common.bean;


/**
 * 我发布的消息和我需要的帮助
 * @author yumeng
 *
 */
public class SubWdxxjk {
	
/**
 * "data": [//成功时返回的数据集，失败时为""
{
    	消息id,//用于查看详情
    	失物类型,//失物、拾物、人
    	失物标题,
		丢失日期,
		消息状态
 	},
{
    	消息id,//用于查看详情
    	失物类型,//失物、拾物、人
    	失物标题,
		丢失日期,
		消息状态
 	}
]
}

*/
   String msgid="";     //消息id
   String msgName="";   //消息名称
   String goodstype=""; //物品类型
   String goodsname=""; //物品名称
   String lostdate="";  //丢失日期
   String lostAdress="";//丢失地点
   String msgstate="";  //消息状态
   String picUrl = "";  //图片地址
   String je ="";
   
	public String getMsgid() {
		return msgid;
	}
	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}
	public String getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(String goodstype) {
		this.goodstype = goodstype;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getLostdate() {
		return lostdate;
	}
	public void setLostdate(String lostdate) {
		this.lostdate = lostdate;
	}
	public String getMsgstate() {
		return msgstate;
	}
	public void setMsgstate(String msgstate) {
		this.msgstate = msgstate;
	}
	public String getMsgName() {
		return msgName;
	}
	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}
	public String getLostAdress() {
		return lostAdress;
	}
	public void setLostAdress(String lostAdress) {
		this.lostAdress = lostAdress;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getJe() {
		return je;
	}
	public void setJe(String je) {
		this.je = je;
	}
		
	
}
