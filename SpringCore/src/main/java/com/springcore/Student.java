package com.springcore;

public class Student {

	private String name;
	private String email;
	private String address;
	private String phoneNum;

	public Student() {
		super();
	}

	public Student(String name, String email, String address, String phoneNum) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", address=" + address + ", phoneNum=" + phoneNum + "]";
	}
}
