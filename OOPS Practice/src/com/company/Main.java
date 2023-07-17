package com.company;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.lang.*;

 class GroceryMart {
    private String CustomerName;
    private String Cid;
    private String phoneNumber;
    private double accountBalance;

    private String customerAddress;


    GroceryMart(){
        this("Venu Kishan","123","9879012345",12300,"Jai nagar");

    }
    GroceryMart(String customerName,String Cid,String phoneNumber,double accountBalance,String customerAddress){
        this.CustomerName=customerName;
        this.Cid=Cid;
        this.phoneNumber=phoneNumber;
        this.accountBalance=accountBalance;
        this.customerAddress=customerAddress;
        System.out.println("Paramaterized constructor called");


    }

    /*public void setName(String Name){
        this.CustomerName=Name;
    }
    public void setId(String ID){
        this.Cid=ID;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setCustomerAddress(String CustomerAddress){
        this.customerAddress=CustomerAddress;
    }*/
     public String getName(){
         return this.CustomerName;
     }
     public String getId() {
         return this.Cid;
     }
     public String getPhoneNumber(){
         return this.phoneNumber;
     }
     public String getCustomerAddress(){
         return this.customerAddress;
     }
     public double getBalanceAmount(){
         return this.accountBalance;
     }
     public void Shop(double amount){
        if(accountBalance>amount){
            double remainingAmount=accountBalance-amount;
            System.out.println("Shopping done "+" and your balance amount is"+remainingAmount);
            accountBalance=remainingAmount;
        }
        else {
            System.out.println("Insufficient shopping");
        }
     }
     public void addAmount(double amount){
        accountBalance=accountBalance+amount;
        System.out.println("Amount deposited "+accountBalance);
     }

 }


 class Building {
     private String color;
     Building(String color){
         this.color=color;
     }
     public String getColor(){
         return this.color;
     }
     public void setColor(String color){
         this.color=color;
     }
 }


 class A {
     private int light=10;
     private int sound=20;

     public void getSome(){
         System.out.println("Something");
     }
     A(){
         System.out.println("Ask");
     }

 }
 class B extends A{

     B(){
         super();
     }
     public void getSome(){
         super.getSome();
         System.out.println("Something Below");
     }
     static void getRace(){
         System.out.println("Racer B");
     }
     static void getRace(int a,int b){
         a=1;
         b=2;
         System.out.println("Racer B overloaded 1");

     }
     static void getRace(int a,int b,int c){
         a=1;
         b=2;
         c=3;
         System.out.println("Racer B overloaded 2");
     }

 }



 class C {
     public void makesime(int a,int b){
         System.out.println("Make sime");
     }
 }
class D {
     public void makesime(){
         System.out.println("Make sime 2");
     }
     public static void display(){
         System.out.println("Display something");
     }
}


class Cricket{
     public String formatName;

     Cricket(String formatName){
         this.formatName=formatName;
     }
     public String rule(){
         return "Cricket is an outdoor sport between two users of 11 players each";
     }

}
class TestMatch extends Cricket{

     TestMatch(String formatName){
         super(formatName);
     }
     public String rule(){
         return "PLayed for 5 days";
     }
}
class oneDay extends Cricket{
     oneDay(String formatName){
         super(formatName);
     }
     public String rule(){
         return "Played for one day";
     }
}


public class Main {
    public static void main(String[] arg) {
        Student student1=new Student("Santhosh","121");
        Session FinalYear=new Session("2021",student1);
        Floor thirdFloor=new Floor(5,10000);
        Branch CSE=new Branch("Computer",FinalYear);
        Library APJ=new Library("Best Library","2019",10000,thirdFloor);
        College VIT=new College("Vit",APJ,CSE);
        University VITvellore=new University("VIT",VIT);
        VITvellore.getCollege().getOpeningDate();
        for(int i=1;i<10;i++)
        {
            Cricket cricket=randomMatch();
            System.out.println("Format Type "+i+" is "+cricket.rule());
        }

    }
    public static Cricket randomMatch(){
       int randomNumber=(int)(Math.random()*5)+1;
       System.out.println("random number is "+randomNumber);
       switch (randomNumber){
           case 1:
               return  new TestMatch("Test");
           case 2:
               return  new oneDay("One day");
           default:
               return null;
       }


    }
}