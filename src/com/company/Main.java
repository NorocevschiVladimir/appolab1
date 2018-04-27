package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создаем объекта класса RobotExt - X, Y, course
        // Абстракция это разбиение на несколько классов.
        /// хороший код
        Robot robot1 = new Robot();
        RobotPrinter robotPrinter = new RobotPrinter(new RobotAuthor("Robot Q1","Author VOVa",21));
        robotPrinter.printText();
        robot1.width = 20;
        robot1.length = 20;

        Circle circle = new Circle();
        circle.radius = 40;
        circle.calculateArea();

        Rectangle rectangle = new Rectangle();
        rectangle.length = 20;
        rectangle.width = 23;
        rectangle.calculateArea();


        Car car = new Car();
        car.getCar();
        car.getCarDetails();

        //Наследующий класс должен дополнять, а не замещать поведение базового класса.
        Main calculate = new Main();
        calculate.calculate(new GeneratoreMethod()); // liskov substitution

        robot1.getRobotName("Vladimir");
        robot1.getRobotSerial();
        robot1.setCourse(45);

        //open - заполняем данные здесь
        //close - с ними делаем операции, но мы их не видим. В классе не видно какие операции мы выполняем.
        //класс легко расширяемый без изменения самого класса
        AreaCalculator areaCalculator = new AreaCalculator(); // создаем объект
        Robot robot2 = new Robot();
        robot2.y = 40;
        robot2.x = 59;


        List<WeatherSource> weatherSources = new ArrayList<>(); // dependency inversion
        weatherSources.add(() -> 120.0f);
        WeatherAggregator weatherAggregator = new WeatherAggregator(weatherSources);
        weatherAggregator.getTemperatureRobot();
//

        System.out.println("Движения первого робота: ");
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

    public void calculate(Robot r) {
        r.setCourse(45);
        r.forward(30);
    }
}
