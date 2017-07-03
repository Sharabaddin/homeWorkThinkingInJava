package com.sharabaddin;

import static net.mindview.util.Print.*;

public class Detegrent extends Cleanser {
    // Изменяем метод
    public void scrub() {
        append(" Detegrent.scrub()");
        super.scrub();//Вызиываем метод базового класса
    }
    
    //Добавляем новый метод к интерфейсу
    public void foam() {
        append("foam()");
    }   
    // Проверяем новый класса
    public static void main(String[] args) {
        Detegrent x = new Detegrent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Проверяем базовый клас");
        
        Cleanser.main(args);
    }
}
