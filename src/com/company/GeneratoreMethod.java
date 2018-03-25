package com.company;

public class GeneratoreMethod extends Robot {

    //больше функционала

    @Override
    public void setCourse(double course) {
        super.setCourse(course);
        super.forward((int) course);
        System.out.println("Liskov "+ course);
    }

    @Override
    public void forward(int distance) {
        super.forward(distance);
        System.out.println("Liskov "+ distance);
    }
}