package com.library;

/**
 * Service class for managing book-related business logic.
 * Depends on BookRepository, injected by Spring.
 */
public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService bean created by Spring.");
    }

    // Setter injection used by Spring
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageBooks() {
        System.out.println("Managing books via BookService.");
        bookRepository.saveBook("Spring in Action");
    }
}
