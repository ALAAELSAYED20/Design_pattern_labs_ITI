package com;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<BookInterface> books = new ArrayList<>();

    public void addBook(BookInterface book) {
        books.add(book);
    }

    public BookInterface findBook(String title) {
        for (BookInterface book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title, User user) {
        BookInterface book = findBook(title);
        if (book == null) {
            System.out.println(title + " is not found in the library.");
        } else if (!book.isAvailable()) {
            System.out.println(title + " is not available.");
        } else {
            book.borrowBook(user);
        }
    }

    public void returnBook(String title) {
        BookInterface book = findBook(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println(title + " is not found in the library.");
        }
    }
}
