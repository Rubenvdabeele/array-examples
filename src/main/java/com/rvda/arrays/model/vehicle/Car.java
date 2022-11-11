package com.rvda.arrays.model.vehicle;

public class Car implements WheeledVehicle, MotorVehicle {

    private String model;

    public Car(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    @Override
    public void start(){
        System.out.println(model + " Vrooom!");;
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}