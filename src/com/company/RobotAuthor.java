package com.company;
// модель
public class RobotAuthor {

        String text;
        String author;
        int length;
// конструктор
    RobotAuthor(String t,String author,int length) {
        this.text = t;
        this.author = author;
        this.length = length;
    }
        String getText() { return text; } // берем текст
        void setText(String s) { this.text = s;} // вставляем текст
        String getAuthor() { return author; }
        void setAuthor(String s) { this.author = s; }
        int getLength() { return length; }
        void setLength(int k) { length = k; }
}
