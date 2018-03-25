package com.company;


public class Robot implements RobotManager
{
    // Текущая координата X
      double x = 0; // когда использую только в этом классе, переменную
    // Текущая координата Y
     double y = 0;
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


    public void setCourse(double course) {
        this.course = course;
    }

    @Override
    public void getRobotName(String name) {
        System.out.println("Robot Name "+ name);
    }

    @Override
    public void setRobotName(String user) {
        System.out.println("name " + user);
    }

    @Override
    public void getRobotSerial() {
        System.out.println("Robot Serial 1");
    }

}