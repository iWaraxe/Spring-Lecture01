package com.coherentsolutions.section06;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void processBook() {
        bookRepository.save();
        System.out.println("Book processed.");
    }
}
