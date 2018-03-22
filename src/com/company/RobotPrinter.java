package com.company;

public class RobotPrinter {

    RobotAuthor text;

    RobotPrinter(RobotAuthor t) {
            this.text = t;
        }

        void printText() { System.out.println("This"+ text.getText()+text.getAuthor()+text.getLength()); }
}
