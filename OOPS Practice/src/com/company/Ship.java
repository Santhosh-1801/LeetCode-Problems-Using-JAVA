package com.company;

public abstract class Ship {
    private int motors;
    private int wheels;

    public abstract void moving();
    public abstract void flying();
}
abstract class Livingstone extends Ship{

    public void moving(){
        System.out.println("Livingstone is moving");
    }

}
abstract class Markerstone extends Livingstone{
    public void moving(){
        super.moving();
        System.out.println("Markerstone is moving");
    }
    public void flying(){
        System.out.println("It is flying");
    }
}
