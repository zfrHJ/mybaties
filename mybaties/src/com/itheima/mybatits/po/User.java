package com.itheima.mybatits.po;

import java.io.Serializable;
import java.util.Date;

public class User  implements Serializable{
	private int id;
	private String username;// 用户姓名
	private String sex;// 性别
	private Date birthday;// 出生日期
	private String address;// 地址
	private String detail;// 详细信息
	private Float score;// 成绩
	
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	
	
	
}
