package com.company;

public class Branch {
    private String BranchName;
    private Session session;

    Branch(String BranchName,Session session){
        this.BranchName=BranchName;
        this.session=session;
    }
    public String getBranchName(){
        return this.BranchName;
    }
    public Session getSession(){
        return this.session;
    }
}
