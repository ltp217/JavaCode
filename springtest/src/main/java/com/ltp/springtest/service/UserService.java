package com.ltp.springtest.service;

import com.ltp.springtest.dao.UserDao;

//@Component
public class UserService {
	private UserDao userDao;
	
	@SuppressWarnings("unused")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void init() {
		System.out.println("--------"+userDao);
		if (this.userDao == null) {
            throw new IllegalStateException("The [userDao] property must be set.");
        }
	}
	
}
