package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.UserDAoImpl;
import com.demo.dao.UserDao;

public class ProductServiceImpl implements ProductService{

	static UserDao uDao=new UserDAoImpl();
	@Override
	public MyUser checkUser(String uname, String pass) {
		
		return uDao.checkUser(uname,pass);
	}

}
