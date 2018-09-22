package com.sy.common.bean;

import java.util.Date;

/**
 * 我的消息列表
 * @author wangliang
 * 
 */
public class SubWdxxlbsub {
	
	/**
	 * 	{
  			消息id4,
  			消息主题, <新增>
  			推送时间, <新增>
  			消息内容,
  			读取状态
  			
  			
		}
	 */
    public Integer tSyMessagePushId;
    public String tSyTheme;
    public String tSyPushDate;
    public String tSyPushContent;
    public String tSyRwStatus;

	public Integer gettSyMessagePushId() {
		return tSyMessagePushId;
	}
	public void settSyMessagePushId(Integer tSyMessagePushId) {
		this.tSyMessagePushId = tSyMessagePushId;
	}
	public String gettSyTheme() {
		return tSyTheme;
	}
	public void settSyTheme(String tSyTheme) {
		this.tSyTheme = tSyTheme;
	}
	public String gettSyPushDate() {
		return tSyPushDate;
	}
	public void settSyPushDate(String tSyPushDate) {
		this.tSyPushDate = tSyPushDate;
	}
	public String gettSyPushContent() {
		return tSyPushContent;
	}
	public void settSyPushContent(String tSyPushContent) {
		this.tSyPushContent = tSyPushContent;
	}
	public String gettSyRwStatus() {
		return tSyRwStatus;
	}
	public void settSyRwStatus(String tSyRwStatus) {
		this.tSyRwStatus = tSyRwStatus;
	}
    
    

	
    
 /*   public String userid;
    
    public String msguser;
    
    public String msgdelstatus;
    
    public Date msgdeldate;*/
	
	
}
