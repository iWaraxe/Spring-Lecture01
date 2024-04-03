package com.coherentsolutions.section08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AppConfig appConfig = context.getBean("appConfig18", AppConfig.class);

        appConfig.printConfig();
        context.close();
    }
}
