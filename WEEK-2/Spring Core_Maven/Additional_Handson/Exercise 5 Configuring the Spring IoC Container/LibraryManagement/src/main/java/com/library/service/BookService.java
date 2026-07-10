package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService bean created by Spring.");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void execute() {
        System.out.println("Managing books via BookService.");
        bookRepository.execute();
    }
}
