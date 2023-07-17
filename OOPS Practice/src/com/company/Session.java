package com.company;

public class Session {
    private String SessionName;
    private Student student;

    Session(String SessionName,Student student){

        this.SessionName=SessionName;
        this.student=student;

    }
    public String getSessionName(){
        return this.SessionName;
    }
    public Student getStudent(){
        return this.student;
    }
}
