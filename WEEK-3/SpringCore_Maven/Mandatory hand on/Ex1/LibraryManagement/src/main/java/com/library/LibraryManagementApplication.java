package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main entry point for the Library Management application.
 * Loads the Spring context and demonstrates IoC / Dependency Injection.
 */
public class LibraryManagementApplication {

    public static void main(String[] args) {
        // Load Spring ApplicationContext from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring Context loaded successfully!");

        // Retrieve the BookService bean from the Spring container
        BookService bookService = (BookService) context.getBean("bookService");

        // Use the service
        bookService.manageBooks();

        // Close the context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
