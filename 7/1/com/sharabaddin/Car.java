package com.sharabaddin;

public class Car {
    String model = "Tesla s";
    
    public Car() {
        System.out.println("Сконструирован Car()");
    }
    
    //@Overriding
    public String toString() {
        return "model = " + model;
    }
}
