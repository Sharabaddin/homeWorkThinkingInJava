package com.sharabaddin;

public class ConnectionManager {

    private static final int MAX_ELEMENT = 3;
    private static Connection[] conects = new Connection[MAX_ELEMENT];
    private static int id = 0;
    
    public static Connection makeConnection() {
        if (id < MAX_ELEMENT) {
            id++;
            return conects[id];
        } else {
            return null;
        }
        
    }
}
