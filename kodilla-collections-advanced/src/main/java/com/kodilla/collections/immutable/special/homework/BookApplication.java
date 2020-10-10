package com.kodilla.collections.immutable.special.homework;

import java.lang.reflect.Field;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.addBook("The Lion", "Nelson DeMille");
        Book book2 = bookManager.addBook("General's Daughter", "Nelson DeMille");
        Book book3 = bookManager.addBook("General's Daughter", "Nelson DeMille");

        System.out.println("Books in collection: " + bookManager.getBooks());
        System.out.println("Number of books: " + bookManager.getBooks().size());

        for (Book book : bookManager.getBooks()) {
            System.out.println(book.hashCode());
        }

        if (book2 != book3 && book2.equals(book3))
            System.out.println("New book with the same Title and Author has different address in Memory");

    }
}
