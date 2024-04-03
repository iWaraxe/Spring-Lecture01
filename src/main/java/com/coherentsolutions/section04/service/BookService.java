package com.coherentsolutions.section04.service;

import com.coherentsolutions.section04.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void processBook() {
        System.out.println("Processing book...");
        bookRepository.saveBook();
    }
}
