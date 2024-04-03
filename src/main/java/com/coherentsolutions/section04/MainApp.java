package com.coherentsolutions.section04;

import com.coherentsolutions.section04.service.BookService;
import com.coherentsolutions.section06.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Loading the Spring XML configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieving the bookService bean from the Spring IoC container
        BookService bookService = context.getBean("bookService14", BookService.class);

        // Using the bookService bean
        bookService.processBook();

        // Closing the context
        context.close();
    }
}
