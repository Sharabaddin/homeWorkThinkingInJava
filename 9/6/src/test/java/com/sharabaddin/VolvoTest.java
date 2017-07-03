package com.sharabaddin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class VolvoTest extends TestCase {

    public void testStart(){
        Volvo volvo = new Volvo();
        
        assertEquals(volvo.start(2), 4);
    }

        public void testStop(){
        Volvo volvo = new Volvo();
        
        assertEquals(volvo.stop(2), 6);
    }

        public void testJump(){
        Volvo volvo = new Volvo();
        
        assertEquals(volvo.jump(2), 8);
    }
}