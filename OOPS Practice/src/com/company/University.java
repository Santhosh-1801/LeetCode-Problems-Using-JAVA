package com.company;

public class University {
    private String univeristyname;
    private College college;


    University(String univeristyname,College college){
        this.univeristyname=univeristyname;
        this.college=college;
    }
    public String getUniveristyname(){
        return  this.univeristyname;
    }
    public College getCollege(){
        return this.college;
    }
}
