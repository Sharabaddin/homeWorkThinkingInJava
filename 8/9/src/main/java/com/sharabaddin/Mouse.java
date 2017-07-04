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
        return name.length() != 0;
    }
}