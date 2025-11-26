package com.demo.dao;

import java.sql.Connection;

import com.demo.beans.MyUser;

public  class UserDAoImpl implements UserDao{

	static Connection con;
	
	public UserDAoImpl()
	{
		con=DBUtill.getUserConnection();
	}

	public MyUser checkUser(String uname, String pass) {
		
		return null;
	}

}
