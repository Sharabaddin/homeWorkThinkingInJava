package com.sharabaddin;

import com.etc.Move; 

public class Volvo implements Move {
    public int start(int speed) {
        return 2 * speed;
    }

    public int stop(int speed) {
        return 3 * speed;
    }

    public int jump(int speed) {
        return 4 * speed;
    }
}