package com.company;

public class Car implements CarManager {
    @Override
    public String getCar() {
        System.out.println("Car Ferrari");
      return "Car Ferrari";
    }

    @Override
    public String getCarDetails() {
        System.out.println("1985 year this Ferrari speed 350 km/h");
        return "OK details";

    }

    @Override
    public String getAllDetails() {
        return "Details";
    }

    @Override
    public String setCar(String car) {
        return car;
    }

    @Override
    public String setCarDetails(String car) {
        return car;
    }
}
