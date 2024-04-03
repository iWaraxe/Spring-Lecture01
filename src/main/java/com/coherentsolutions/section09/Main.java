package com.coherentsolutions.section09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring context from applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve AppConfig bean and print configuration
        AppConfig appConfig = context.getBean("appConfig19", AppConfig.class);
        appConfig.printConfig();

        // Close the context
        context.close();
    }
}
