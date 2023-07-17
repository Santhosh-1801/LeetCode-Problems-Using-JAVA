package com.company;

public class Library {
    private String name;
    private String yofbuild;
    private int NoOfBooks;
    private Floor floor;

    public Library(String name,String yofbuild,int NoOfBooks,Floor floor){
        this.name=name;
        this.yofbuild=yofbuild;
        this.NoOfBooks=NoOfBooks;
        this.floor=floor;
    }
    public String getName(){
        return this.name;
    }
    public String getYofbuild(){
        return this.yofbuild;
    }
    public  int getNoOfBooks(){
        return this.NoOfBooks;
    }
    public Floor getFloor(){
        return this.floor;
    }

}
