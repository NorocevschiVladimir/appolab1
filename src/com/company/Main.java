package com.company;

public class Main {

    public static void main(String[] args) {
        // Создаем объекта класса RobotExt - X, Y, course
        // Абстракция это разбиение на несколько классов.
        Robot robot1 = new Robot();
        System.out.println("Движения первого робота: ");

        ///плохой код
        robot1.getRobotName();
        robot1.getRobotSerial();
        robot1.getCar();
        ///
        robot1.forward(20);
        robot1.setCourse(90);
        robot1.printCoordinatesForward();
        robot1.forward(40);
        robot1.setCourse(100);
        robot1.forward(50);
        robot1.printCoordinatesForward();
        RobotExt robot = new RobotExt(0, 0, 0); // полиморфизм, когда я создаю новый объект.
        System.out.println("Движения второго робота: ");
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinatesForward();
        robot.setCourse(60);
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinatesForward();

        // Курс 45 градусов
        robot.setCourse(45);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinatesForward();
        // И назад на 10 метров - это метод для RobotExt
        robot.back(10);
        // Напечатать координаты
        robot.printCoordinatesBack();
    }
}
