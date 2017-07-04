package com.sharabaddin;

public class App 
{
    public static void main( String[] args ) {
        Rodent[] rodents = {
            new Mouse("Patrisiya"),
            new Hamster("Beni4ka")
        };

        doAll(rodents);
    }

    public static void doAll(Rodent[] rodents) {
        for (Rodent rodent: rodents) {
           System.out.println(rodent.getName());
           System.out.println(rodent.go());
        }
    }
}