package com.main;

import com.sharabaddin.Car;

public class Main {
    
    private Car car;
    
    public static void main(String[] args) {
         Main main = new Main();
         System.out.println(main);          
    }
    
    //@Overriding
    public String toString() {
        if(car == null) {
            car = new Car();
        }
        return "car" + car;
    }
}
