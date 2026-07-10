package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepositoryConstructor;
    private BookRepository bookRepositorySetter;

    public BookService(BookRepository bookRepositoryConstructor) {
        this.bookRepositoryConstructor = bookRepositoryConstructor;
        System.out.println("BookService bean created by Spring.");
    }

    public void setBookRepositorySetter(BookRepository bookRepositorySetter) {
        this.bookRepositorySetter = bookRepositorySetter;
    }

    public void checkInjection() {
        System.out.println("Managing books via BookService.");
        System.out.println("Constructor Injection active: " + (bookRepositoryConstructor != null));
        System.out.println("Setter Injection active: " + (bookRepositorySetter != null));
    }
}
