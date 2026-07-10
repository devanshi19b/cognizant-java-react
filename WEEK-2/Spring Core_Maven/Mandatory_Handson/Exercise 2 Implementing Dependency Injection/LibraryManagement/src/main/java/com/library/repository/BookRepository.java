package com.library.repository;

public class BookRepository {
    public BookRepository() {
        System.out.println("BookRepository bean created by Spring.");
    }
    public void execute() {
        System.out.println("BookRepository is executing query/operation.");
    }
}
