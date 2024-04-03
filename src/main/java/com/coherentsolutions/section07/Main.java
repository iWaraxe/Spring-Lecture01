package com.coherentsolutions.section07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Loading the Spring application context from the XML configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieving the bookService bean from the Spring container
        BookService bookService = context.getBean("bookService17", BookService.class);

        // Using the bookService bean to process a book
        bookService.processBook();

        // Closing the application context
        context.close();
    }
}