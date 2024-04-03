package com.coherentsolutions.section05.service;

import com.coherentsolutions.section05.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // This annotation marks the class as a Spring-managed component
public class FieldInjectedService {
    @Autowired // Spring injects the BookRepository bean here automatically
    public BookRepository bookRepository;

    public void execute() {
        System.out.println("Executing service with field injection.");
        bookRepository.save();
    }
}
