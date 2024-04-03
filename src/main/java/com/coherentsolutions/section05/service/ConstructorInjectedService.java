package com.coherentsolutions.section05.service;

import com.coherentsolutions.section05.repository.BookRepository;

public class ConstructorInjectedService {
    private final BookRepository bookRepository;

    public ConstructorInjectedService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void execute() {
        System.out.println("Executing service with constructor injection.");
        bookRepository.save();
    }
}
