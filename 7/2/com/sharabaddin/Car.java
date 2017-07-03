package com.sharabaddin;

import static net.mindview.util.Print.*;

public class Car extends Detegrent {

    @Override
    public void scrub() {
        print("override scrub");
    }
    
    public void sterilize() {
        print("sterilize()");
    }
    
    public static void main(String[] args) {
        Car x = new Car();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        print(x);
    }
}
