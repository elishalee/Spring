package com.pk.mvc.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String name;
	private String phone;
	private int age;
	//��2�ڸ�/��2�ڸ�/�⵵4�ڸ� ������ ���ڿ��� �Է��ص� Date �� ��ȯ
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date birthday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
}
