package com.coherentsolutions.section12;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("initDestroyApplicationContext.xml")) {
            // The context initialization triggers the init methods
            System.out.println("Spring context initialized.\n");
            // Access beans or perform actions...

            // On context close, destroy methods will be called
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nSpring context closed.");
    }
}
