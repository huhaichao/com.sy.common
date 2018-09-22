package com.sy.common.bean.AppPayWechatBean;

public class HttpConfig {
	public int numberOfConnections = 5;
	public int timeOutInSeconds = -1;
	
	@Override
	public String toString() {
		return "HttpConf [numberOfConnections=" + numberOfConnections
				+ ", timeOutInSeconds=" + timeOutInSeconds + "]";
	}
}
