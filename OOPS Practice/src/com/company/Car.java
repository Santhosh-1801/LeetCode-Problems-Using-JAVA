package com.company;

public class Car extends Automobile
{
   private String SteeringWheel;
   private String Moonroof;
   private String Batterysize;
   private String Headlamps;
   private String Groundclearance;
   public Car(double topSpeed,String brandName,String YearofManafacture,double cost,String durability,
              String SteeringWheel,String Moonroof,String Batterysize,String Headlamps,String Groundclearance){
        super(topSpeed,brandName,YearofManafacture,cost,durability);
        this.SteeringWheel=SteeringWheel;
        this.Moonroof=Moonroof;
        this.Batterysize=Batterysize;
        this.Headlamps=Headlamps;
        this.Groundclearance=Groundclearance;

   }
   public void movement(){
       super.movement();
   }
   public void topspeed(double speed){
       System.out.println("Car is moving at speed "+speed);
   }
}
