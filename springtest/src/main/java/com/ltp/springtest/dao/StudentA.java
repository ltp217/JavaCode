package com.ltp.springtest.dao;

public class StudentA {
	 
    private StudentB studentB ;
 
    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }
 
    public StudentA() {
    }
    
    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}

