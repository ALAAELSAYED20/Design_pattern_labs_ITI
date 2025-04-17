package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        BookInterface book = new Book("Harry Potter");
        BookInterface physicalBook = new PhysicalBook("Lord of the Rings");
        BookInterface historicalBook = new HistoricalBook("Outlander");

        library.addBook(book);
        library.addBook(physicalBook);
        library.addBook(historicalBook);

        User john = new User("John", false);
        User alice = new User("Alice", true);

        library.borrowBook("Harry Potter", john );
        System.out.println("=============================");
        library.returnBook("Harry Potter");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", john);
        System.out.println("=============================");
        library.borrowBook("math", john);
        library.returnBook("math");
        System.out.println("=============================");
        library.borrowBook("Lord of the Rings", alice);
        System.out.println("=============================");
        library.borrowBook("Outlander", alice);
    }
}
