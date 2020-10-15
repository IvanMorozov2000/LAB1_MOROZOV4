package ru.mirea.gibo03.lab1;
import java.lang.System;

public class Book {

    private String color;
    private int pages;

    public Book(String c, int p) {
        color = c;
        pages = p;
    }

    public Book(String c) {
        color = c;
        pages = 0;
    }

    public Book() {
        color = "Purple";
        pages = 50;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(String color) {
        return color;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return this.color + " book has " + this.pages + " pages.";
    }

    public void numberOfCharacters() {
        System.out.println(" the book has " + pages*20*30 + " lines and the color of the book is "  + color);
    }

}
