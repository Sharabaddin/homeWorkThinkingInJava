package com.sharabaddin.app;

class Volvo extends Car {
    
    public void  show() {
        System.out.println("Show!");
    }

    public static void toDo(Car car) {
        Volvo volvo = (Volvo)car;
        volvo.show();
    }
}