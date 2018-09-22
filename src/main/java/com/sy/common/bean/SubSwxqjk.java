package com.sy.common.bean;

public class SubSwxqjk {

	 String isReward ="";//悬赏
     String phone=""; //电话
	 String chatAccount="";//聊天账号
	 String userName="";//消息发布人名
	 String messageState="";//消息状态 ,用于判断是否可以点击“确认归还”
	 String userUrl=""; //消息发布人的头像URI,如果在修改用户头像的时候，后台可以同步修改环信中用户的头像，这里可以不传
	 String content="";	 
	 
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public String getIsReward() {
		return isReward;
	}

	public void setIsReward(String isReward) {
		this.isReward = isReward;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getChatAccount() {
		return chatAccount;
	}

	public void setChatAccount(String chatAccount) {
		this.chatAccount = chatAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessageState() {
		return messageState;
	}

	public void setMessageState(String messageState) {
		this.messageState = messageState;
	}

	public String getUserUrl() {
		return userUrl;
	}

	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}
	

	
}
