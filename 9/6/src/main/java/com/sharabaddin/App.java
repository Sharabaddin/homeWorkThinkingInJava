package com.sharabaddin;

import com.etc.Move;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Volvo volvo = new Volvo();
        volvo.start(1);
        volvo.stop(2);
        volvo.jump(3);
        outpotString(volvo);
    }

    public static void outpotString(Move car) {
        System.out.println(car.start(100));
    }
}
