package com.company;


import sun.rmi.runtime.Log;

public class Robot implements RobotManager
{
    // Текущая координата X
    private double x = 0; // когда использую только в этом классе, переменную
    // Текущая координата Y
    private double y = 0;
    // Текущий курс (в градусах)
    private double course = 0;

    //конструктор
    public Robot() {
    }

    // Передвижение на дистанцию distance
    public void forward(int distance) {
        //могу использовать в другом классе
        // Обращение к полю объекта X
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // Обращение к полю объекта Y
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }
//protected - когда есть RobotExt наследуется от Robot, и если переменная protected, он сможет использовать его функционал тоже, если только наследуется


    // Печать координат робота
    public void printCoordinatesForward() {
        System.out.println("Двигаюсь вперед на координаты x = " + x + ", y = " + y);
    }

    public void printCoordinatesBack() {
        System.out.println("Двигаюсь назад на координаты x = " + x + ", y = " + y);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    @Override
    public void getRobotName() {
        System.out.println("Robot Name Vasea");
    }

    @Override
    public void getRobotSerial() {
        System.out.println("Robot Serial 1");
    }

}