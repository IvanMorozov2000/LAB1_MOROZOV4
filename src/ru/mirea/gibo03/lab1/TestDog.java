package ru.mirea.gibo03.lab1;
import java.lang.System;

public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Petr", 2);
        Dog d2 = new Dog("Gosha", 4);
        Dog d3 = new Dog("Evdak");

        d3.setAge(3);

        System.out.println(d1);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
