package com.company.Bridge;

public class Main {
    public static void main(String...args){
        Rectangle rectangleRed = new Rectangle(new Red());
        Triangle triangleRed = new Triangle(new Red());

        triangleRed.draw();
        rectangleRed.draw();


    }
}
