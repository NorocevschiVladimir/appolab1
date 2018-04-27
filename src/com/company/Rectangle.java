package com.company;

public class Rectangle implements Shape{
    double length;
    double width;
    double res2;
    public double calculateArea(){
        res2 = length * width;
        System.out.println("Calculate Rectangle = " + res2);
        return length * width;
    }
}
