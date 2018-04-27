package com.company;
// общий интерфейс с роботом или общий класс
//должен быть метод абстрактный
//тут функционал areacalculator
//пару классов типо робота и они тоже должны иметь движения
//для общего интерфейса или класса.
abstract public class object {
    public String calculateRectangleArea(Car robot){
              System.out.println(String.valueOf(robot.getCar() + robot.getCarDetails()+ robot.getAllDetails()));
        return robot.getAllDetails();
    }
}
