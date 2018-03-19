package com.company;

public class Car implements CarManager {
    @Override
    public void getCar() {
        System.out.println("Car Ferrari");

    }

    @Override
    public void getCarDetails() {
        System.out.println("1985 year this Ferrari speed 350 km/h");

    }
}
