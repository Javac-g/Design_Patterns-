package com.company.Composite;

public class SportCar implements Car{
    @Override
    public void draw(String color) {
        System.out.println("Draw " + color + " sport car");
    }
}
