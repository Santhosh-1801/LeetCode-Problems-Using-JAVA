package com.company;

public class College {
    private String CollegeName;
    private Library library;
    private Branch branch;

    public College(String CollegeName,Library library,Branch branch){
        this.CollegeName=CollegeName;
        this.library=library;
        this.branch=branch;

    }
    public String getCollegeName(){
        return this.CollegeName;
    }
    public Library getLibrary(){
        return this.library;
    }
    public Branch getBranch(){
        return this.branch;
    }
    public void getOpeningDate(){
        System.out.println("The opening date is 15th August");
    }

}

