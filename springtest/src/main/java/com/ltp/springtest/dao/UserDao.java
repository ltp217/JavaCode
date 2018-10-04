package com.ltp.springtest.dao;

import org.springframework.stereotype.Component;

import com.ltp.springtest.entity.User;

//@Component
public class UserDao {
	
	private User user;
	
	public UserDao() {}
	
	public UserDao(String name,User user) {
//		System.out.println("========name:"+name+"=="+user.getName()+",--"+user.getId());
	}
	
	public UserDao(String name,User user,User user2) {
//		System.out.println("========name:"+name+"=="+user.getName()+",--"+user.getId());
//		System.out.println(user.hashCode()+"==="+user2.hashCode()+user.equals(user2));
//		System.out.println(user2.getName());
	}
	
	public UserDao(String name) {
		System.out.println("11========name:"+name);
	}
}
