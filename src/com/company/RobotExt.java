package com.company;

public class RobotExt extends Robot // наследование, он наследует методы класса робот
{
    public RobotExt(double x, double y, double course) {
        setCourse(course);
    }

    public void back(int distance) {
        forward(-distance);
    }
}