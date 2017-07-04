package com.sharabaddin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MouseTest extends TestCase{

    public void testGetName() {
        Mouse mouse = new Mouse("Suzan");
        assertEquals(mouse.getName() , "Iam a mouse. My name is Suzan");
    }

    public void testGo() {
        Mouse mouse = new Mouse("Suzan");
        assertTrue(mouse.go());

        Mouse mouseEmpty = new Mouse("");
         assertFalse(mouseEmpty.go());
    }
}