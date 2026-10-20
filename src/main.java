package PACKAGE_NAME;

import PACKAGE_NAME.lms.model.Book;
import PACKAGE_NAME.lms.model.DVD;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello worldd!");


        Book b = new Book("B001", "Clean Code", "Robert C. Martin");
        DVD d = new DVD("D001", "Intro to Algorithms", 120);
        System.out.println(b.calculateLateFee(3)); // expect 30.0
        System.out.println(d.calculateLateFee(3)); // expect 75.0
        new Book("", "Nobody", "Nobody"); // expect IllegalArgumentException
    }
}