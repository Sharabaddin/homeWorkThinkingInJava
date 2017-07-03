package com.sharabaddin;

import com.etc.Move; 

public class Volvo implements Move {
    private int start(int speed) {
        return 2 * speed;
    }

    private int stop(int speed) {
        return 3 * speed;
    }

    private int jump(int speed) {
        return 4 * speed;
    }
}