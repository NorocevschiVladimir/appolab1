package com.company;

public class Circle implements Shape{
    public double radius;
    double res1;
    public double calculateArea(){
        res1 = (22/7)*radius*radius;
        System.out.println("Calculate Circle = " + res1);
        return (22/7)*radius*radius;

    }
}
