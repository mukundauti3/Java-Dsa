package com.demo.dao;

import com.demo.beans.MyUser;

public interface UserDao {

	MyUser checkUser(String uname, String pass);

}
