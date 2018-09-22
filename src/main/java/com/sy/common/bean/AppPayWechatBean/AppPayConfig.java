package com.sy.common.bean.AppPayWechatBean;

/**
 * APP接口获取传入参数
 * @author lizhenzhong 2017.5.28
 */
public class AppPayConfig {
		private String appId = "wx333386e333333c44";
		private String mchId = "1611111110";
		private String key = "63d8ddd6ff234233edefb2633c218f7c";
		
		public String getAppId() {
			return appId;
		}
		public void setAppId(String appId) {
			this.appId = appId;
		}
		public String getMchId() {
			return mchId;
		}
		public void setMchId(String mchId) {
			this.mchId = mchId;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		/**
		 * 判断所有参数都正常传递
		 * @return
		 */
		public boolean isReady() {
			return appId != null && mchId != null && key != null;
		}
		@Override
		public String toString() {
			return "AppPayConf [appId=" + appId + ", mchId=" + mchId + ", key="
					+ key + "]";
		}
}
