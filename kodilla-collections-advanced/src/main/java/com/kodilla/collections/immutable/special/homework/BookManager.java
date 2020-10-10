package com.kodilla.collections.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books = new ArrayList<>();

    public Book addBook(String title, String author) {
        Book newBook = new Book(title, author);

        for (Book book : books) {
            if (book.equals(newBook)) {
                System.out.println("Exists: " + book.equals(newBook) + " - adding similar book but in different address");
                books.add(newBook);
                return newBook;
            } else {
                System.out.println("Exists: " + book.equals(newBook) + " - adding brand new book to the collection");
            }
        }
        books.add(newBook);
        return newBook;
    }

    public List<Book> getBooks() {
        return books;
    }
}
