package com.rvda.arrays;

import com.rvda.arrays.model.vehicle.Bike;
import com.rvda.arrays.model.vehicle.Car;
import com.rvda.arrays.model.vehicle.WheeledVehicle;

public abstract class LoopExamples {
    public static void loopExamples(){

        // Iterating over an array using a for loop
        String[] carBrands = {"Volvo", "Mazda", "Mercedes", "Volkswagen", "Hyundai"};

        for(int i = 0; i < carBrands.length; i++ ){
            System.out.println(carBrands[i]);
        }


        // Iterating over a jagged array using neste for loops
        String[][] jaggedStringArray = {{"1a","1b"}, {"2a","2b","2c"}};

        for(int i = 0; i < jaggedStringArray.length; i++){
            System.out.println("Row: " + (i + 1));
            for(int j = 0; j < jaggedStringArray[i].length; j++ ){
                System.out.println(jaggedStringArray[i][j]);
            }
        }

        // Using the homegenous nature of array contents
        Car[] cars = {new Car("Volvo"), new Car("Mercedes"), new Car("Porsche")}; 

        for(int i = 0; i < cars.length; i++){
            //The array contains cars, so we can treat them all the same!
            cars[i].start();
        }

        //It even works for interfaces!
        WheeledVehicle[] carAndABike = {new Car("Volvo"), new Bike()};

        for(int i = 0; i < carAndABike.length; i++ ){
            System.out.println(carAndABike[i].getNumberOfWheels());
        }

    } 
}
