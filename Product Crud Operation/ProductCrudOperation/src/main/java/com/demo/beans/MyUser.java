package com.demo.beans;

public class MyUser {
	
	private String uname;
	private String pass;
	private int uId;
	private String email;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MyUser(String uname, String pass, int uId, String email) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.uId = uId;
		this.email = email;
	}
	public MyUser() {
		super();
	}
	
	
	

}
