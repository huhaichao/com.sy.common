package com.sy.common.bean;

/**
	"data": 
	{//成功时返回的数据集，失败时为""
	姓名, 
	昵称,
	性别,
	出生年月,
	证件类型,
	证件号,
	电子邮箱,
	绑定手机,
	用户头像URI
	}
 * @author yumeng
 *  用户信息接口
 */
public class SubYhxxjk {
    String name="";
    String nickname="";
    String sex="";
    String birthday="";
    String type="";
    String number="";
    String email="";
    String phone="";
    String imgurl="";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
}
