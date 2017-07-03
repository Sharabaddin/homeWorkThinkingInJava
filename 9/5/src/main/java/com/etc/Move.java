package com.etc;

public interface Move {
    int start(int speed);
    int stop(int speed);
    int jump(int speed);
}