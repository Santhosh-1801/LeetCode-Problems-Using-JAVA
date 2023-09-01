package com.company;

public abstract  class FirstVehicle implements CarAnglo {

    private boolean engineOn=false;
    @Override
    public void steering(){

    }
    public void starting(){
        engineOn=true;
        System.out.println("Started");
    }
    @Override
    public void stopping() {

    }

    @Override
    public void accelerating() {

    }

    @Override
    public void findingNoofWheels() {

    }
    public void tellingName(){
        System.out.println("Iam First Vehicle");
    }
}

