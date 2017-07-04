package com.sharabaddin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HamsterTest extends TestCase{

    public void testGetName() {
        Hamster Hamster = new Hamster("Benya");
        assertEquals(Hamster.getName(), "Iam a hamster. My name is Benya");
    }

    public void testGo() {
        Hamster Hamster = new Hamster("Benya");
        assertTrue(Hamster.go());

        Hamster HamsterEmpty = new Hamster("");
        assertFalse(HamsterEmpty.go());        
    }
}