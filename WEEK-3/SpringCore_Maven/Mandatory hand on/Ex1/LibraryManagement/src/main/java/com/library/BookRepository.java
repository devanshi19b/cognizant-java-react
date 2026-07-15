package com.library;

/**
 * Repository class for managing Book data.
 * Spring will manage this bean and print a message on creation.
 */
public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository bean created by Spring.");
    }

    public void saveBook(String title) {
        System.out.println("Book saved: " + title);
    }
}
