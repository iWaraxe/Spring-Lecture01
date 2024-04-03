package com.coherentsolutions.section05;

import com.coherentsolutions.section05.repository.BookRepository;
import com.coherentsolutions.section05.service.ConstructorInjectedService;
import com.coherentsolutions.section05.service.SetterInjectedService;
import com.coherentsolutions.section05.service.FieldInjectedService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        BookRepository repository = new BookRepository();

        // Constructor Injection
        ConstructorInjectedService constructorService = new ConstructorInjectedService(repository);
        constructorService.execute();

        // Setter Injection
        SetterInjectedService setterService = new SetterInjectedService();
        setterService.setBookRepository(repository);
        setterService.execute();

        // Field Injection
        FieldInjectedService fieldService = new FieldInjectedService();
        fieldService.bookRepository = repository; // Direct field access (not recommended outside of Spring context)
        fieldService.execute();

        // Field Injection: Using Spring to manage field injection
        // The below direct assignment simulates what Spring does under the hood for field injection
        // In a fully integrated Spring application, obtaining the bean from the context would demonstrate this more naturally
        //FieldInjectedService fieldService = context.getBean(FieldInjectedService.class);
        // No manual assignment is necessary as Spring handles it
        //fieldService.execute();
    }
}
