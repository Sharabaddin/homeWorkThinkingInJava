package com.sharabaddin;

public class Mouse extends Rodent {
    private String name;

    Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return "Iam a mouse. My name is " + name;
    }

    public boolean go() {
        if (name.length() != 0) {
            return true;
        } else {
            return false;
        }
    }
}