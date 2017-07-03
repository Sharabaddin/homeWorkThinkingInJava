package com.sharabaddin;

import static net.mindview.util.Print.*;

public class Cleanser {
    private String s = "Cleanser";
    
    public void append(String a) {
        s +=a;
    }
    
    public void dilute() {
        append("dilute()");
    }
    
    public void apply() {
        append("apply()");
    }
    
    public void scrub() {
        append("scrub()");
    }
    
    @Override
    public String toString() {
        return s;
    }
    
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}
