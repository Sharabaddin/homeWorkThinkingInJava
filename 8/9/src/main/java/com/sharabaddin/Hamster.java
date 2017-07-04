package com.sharabaddin;

public class Hamster extends Rodent {
    private String name;

    Hamster(String name) {
        this.name = name;
    }

    public String getName() {
        return "Iam a hamster. My name is " + name;
    }

    public boolean go() {
        if (name.length() != 0) {
            return true;
        } else {
            return false;
        }
    }
}