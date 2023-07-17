package com.company;

public class Automobile {
    private double topSpeed;
    private String BrandName;
    private String YearofManafacture;
    public double Cost;

    public String durability;

    Automobile(double topSpeed,String BrandName,String YearofManafacture,double Cost,String durability){
        this.topSpeed=topSpeed;
        this.BrandName=BrandName;
        this.YearofManafacture=YearofManafacture;
        this.Cost=Cost;
        this.durability=durability;
    }
    public void movement(){
        System.out.println("Vehicle is moving");
    }
    public void topspeed(double speed){
        System.out.println("Car is moving at speed "+speed);
    }


}


