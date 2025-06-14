package com.example.book;

import com.example.books.entities.Book;

public class App {
    public static void main(String[] args) {
        Services services = new Services();

        // 1. CREATE a book
        Book book1 = new Book();
        book1.setTitle("Deep Work");
        book1.setAuthor("Cal Newport");
        book1.setIsbn("978-1455586691");
        book1.setPublishedYear(2016);

        services.saveBook(book1);
        System.out.println("Book saved successfully.");

        // Assume the ID of the saved book is 1 (replace with actual ID if needed)

        int bookId = 1; // You can fetch actual ID if using auto-generated

        // 2. FETCH the book
        Book fetchedBook = services.fetchBook(bookId);
        if (fetchedBook != null) {
            System.out.println("Fetched Book:");
            System.out.println("Title: " + fetchedBook.getTitle());
            System.out.println("Author: " + fetchedBook.getAuthor());
        } else {
            System.out.println("Book not found.");
        }

        // 3. UPDATE the book
        Book updatedBook = new Book();
        updatedBook.setTitle("Deep Work (Updated)");
        updatedBook.setAuthor("Cal Newport");

        Book result = services.updatebook(bookId, updatedBook);
        if (result != null) {
            System.out.println("Book updated to Title: " + result.getTitle());
        } else {
            System.out.println("Book not found for update.");
        }

        // 4. DELETE the book
        //services.deleteEmp(bookId);
       // System.out.println("Book deleted (if existed).");
    }
}
