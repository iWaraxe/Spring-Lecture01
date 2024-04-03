package com.coherentsolutions.section05.service;

import com.coherentsolutions.section05.repository.BookRepository;

public class SetterInjectedService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void execute() {
        System.out.println("Executing service with setter injection.");
        bookRepository.save();
    }
}
