package com;

public class Book implements BookInterface {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(user.getName() + " successfully borrowed " + title);
        } else {
            System.out.println(title + " is not available.");
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}
