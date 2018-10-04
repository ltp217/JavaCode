package com.ltp.springtest.dao;

public class TeacherDao {
	public static TeacherDao teacherDao = new TeacherDao();
	private TeacherDao() {}
	public static TeacherDao getInstance() {
		return teacherDao;
	}
}
