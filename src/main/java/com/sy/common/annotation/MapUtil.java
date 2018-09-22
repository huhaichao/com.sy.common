package com.sy.common.annotation;

import java.util.Date;

/**
 * 搜索基础类
 * @author yumeng
 * 通过经纬度，搜索类型，明细类型，名称等进行查询
 */
public class MapUtil {
	
	Double minlat;
	Double maxlat;
	Double minlng;
	Double maxlng;
	
	String searchtype;
	String detailtype;
	String searchname;
	String goodid;
	
	String pwd;
	String uid;
	String phone;
	//版本所属平台  wl
	String versionType;
	//版本号 wl
	String versionNum;
	//验证码 wl
	String verCode;
	//旧密码 wl
	String oPwd;
	//新密码 wl
	String nPwd;
	
	String msgtype;//消息类型：0发布1求助
	String msgid;//消息ID
	
	String tSwtype;//失物类型
	Date   tSyDate;//丢失日期 

	public Date gettSyDate() {
		return tSyDate;
	}

	public void settSyDate(Date tSyDate) {
		this.tSyDate = tSyDate;
	}

	String tSwtypeMx;//失物详细类型
	//String tSyName="";//失物名称
	Date   tSyDateStart;//开始日期 
	Date   tSyDateEnd;//结束日期 
	//物品id 主键  wangliang 
	Integer itemId  = 0;
	
	Integer  pageSize = 0;
	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Date gettSyDateStart() {
		return tSyDateStart;
	}

	public void settSyDateStart(Date tSyDateStart) {
		this.tSyDateStart = tSyDateStart;
	}

	public Date gettSyDateEnd() {
		return tSyDateEnd;
	}

	public void settSyDateEnd(Date tSyDateEnd) {
		this.tSyDateEnd = tSyDateEnd;
	}

	int page;//页码
	int pageUp;//上一页

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}



	public String gettSwtypeMx() {
		return tSwtypeMx;
	}

	public void settSwtypeMx(String tSwtypeMx) {
		this.tSwtypeMx = tSwtypeMx;
	}

	
	public String gettSwtype() {
		return tSwtype;
	}

	public void settSwtype(String tSwtype) {
		this.tSwtype = tSwtype;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgid() {
		return msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getGoodid() {
		return goodid;
	}

	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}

	public String getSearchtype() {
		return searchtype;
	}

	public void setSearchtype(String searchtype) {
		this.searchtype = searchtype;
	}

	public String getDetailtype() {
		return detailtype;
	}

	public void setDetailtype(String detailtype) {
		this.detailtype = detailtype;
	}

	public String getSearchname() {
		return searchname;
	}

	public void setSearchname(String searchname) {
		this.searchname = searchname;
	}

	public MapUtil(){
	}
	
	public MapUtil(double lat,double lng){
		this.setErea(lat,lng);
	}
	
	
	
	public String getVersionType() {
		return versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	public String getVersionNum() {
		return versionNum;
	}

	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}

	
	public String getVerCode() {
		return verCode;
	}

	public void setVerCode(String verCode) {
		this.verCode = verCode;
	}

	public String getoPwd() {
		return oPwd;
	}

	public void setoPwd(String oPwd) {
		this.oPwd = oPwd;
	}

	public String getnPwd() {
		return nPwd;
	}

	public void setnPwd(String nPwd) {
		this.nPwd = nPwd;
	}
	
	

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	

	public int getPageUp() {
		return pageUp;
	}

	public void setPageUp(int pageUp) {
		this.pageUp = pageUp;
	}

	public Double getMinlat() {
		return minlat;
	}

	public void setMinlat(Double minlat) {
		this.minlat = minlat;
	}

	public Double getMaxlat() {
		return maxlat;
	}

	public void setMaxlat(Double maxlat) {
		this.maxlat = maxlat;
	}

	public Double getMinlng() {
		return minlng;
	}

	public void setMinlng(Double minlng) {
		this.minlng = minlng;
	}

	public Double getMaxlng() {
		return maxlng;
	}

	public void setMaxlng(Double maxlng) {
		this.maxlng = maxlng;
	}

	public void setErea(double longitude,double latitude){
        //先计算查询点的经纬度范围  
        double r = 6371;//地球半径千米  
        double dis = 1.0;//0.5千米距离  
        double dlng =  2*Math.asin(Math.sin(dis/(2*r))/Math.cos(latitude*Math.PI/180));  
        dlng = dlng*180/Math.PI;//角度转为弧度  
        double dlat = dis/r;  
        dlat = dlat*180/Math.PI;
        double minlat =latitude-dlat;  //最小纬度
        double maxlat = latitude+dlat;  //最大纬度
        double minlng = longitude -dlng; //最小精度
        double maxlng = longitude + dlng; //最大精度         
        this.setMinlat(minlat);
        this.setMaxlat(maxlat);
        this.setMinlng(minlng);
        this.setMaxlng(maxlng);
        System.out.println("minlat=="+minlat+"maxlat=="+maxlat+"minlng=="+minlng+"maxlng=="+maxlng);
	}

	
}
