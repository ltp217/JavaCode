package com.ltp.springtest.dao;

public class StudentC {
	 
    private StudentA studentA ;
 
    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }
 
    public StudentC() {
    }
 
    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}

