package ru.mirea.gibo03.lab1;
import java.lang.System;

public class TestBook {
    public static void main(String[] args) {

        Book b1 = new Book("Red", 100);
        Book b2 = new Book("Green", 200);
        Book b3 = new Book("Black");

        b3.setPages(50);

        System.out.println(b1);

        b1.numberOfCharacters();
        b2.numberOfCharacters();
        b3.numberOfCharacters();
    }

}
