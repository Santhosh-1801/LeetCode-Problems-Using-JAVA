package com.company;

public class Floor {
    private int FloorNo;
    private double floorCapacity;

    public Floor(int FloorNo,double floorCapacity){
        this.FloorNo=FloorNo;
        this.floorCapacity=floorCapacity;
    }

    public int getFloorNo(){
        return this.FloorNo;
    }
    public double getFloorCapacity(){
        return this.floorCapacity;
    }

}
