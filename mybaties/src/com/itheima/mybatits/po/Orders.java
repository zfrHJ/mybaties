package com.itheima.mybatits.po;

import java.io.Serializable;

public class Orders implements Serializable {
	private int id;//����id
	private int user_id;//�û�id
	private String order_number;//������
	
	//�û���Ϣ
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
