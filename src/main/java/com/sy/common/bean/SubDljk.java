package com.sy.common.bean;

public class SubDljk {
	
	/*
	 * "data": {//成功时返回的数据集，失败时为""
	用户id,
	用户名,//如果用手机号作为用户名,可以不传
	用户积分,
	聊天账号,
	用户的头像URI,
	用户状态
	}
	*/
	String userid="";
	String username="";
	String nickname="";
	String userintegration ="";
	String chataccount="";
	String userpictureurl="";
	String userstate="";
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserintegration() {
		return userintegration;
	}
	public void setUserintegration(String userintegration) {
		this.userintegration = userintegration;
	}
	public String getChataccount() {
		return chataccount;
	}
	public void setChataccount(String chataccount) {
		this.chataccount = chataccount;
	}
	public String getUserpictureurl() {
		return userpictureurl;
	}
	public void setUserpictureurl(String userpictureurl) {
		this.userpictureurl = userpictureurl;
	}
	public String getUserstate() {
		return userstate;
	}
	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}
	
	
	
	
}
