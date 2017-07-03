package com.sharabaddin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HumsterTest extends TestCase{

    public void TestGetName() {
        Humster humster = new Humster("Benya");
        assertEquals(humster.getName() , "Iam a humster. My name is Benya");
    }

    public void TestGo() {
        Humster humster = new Humster("Benya");
        assertTrue(humster.go());
    }
}