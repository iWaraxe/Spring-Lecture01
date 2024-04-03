package com.coherentsolutions.section11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeApplicationContext.xml");

        // For default scope (Singleton)
        ImplicitSingletonService implicitSingletonService1 = context.getBean("implicitSingletonService", ImplicitSingletonService.class);
        ImplicitSingletonService implicitSingletonService2 = context.getBean("implicitSingletonService", ImplicitSingletonService.class);
        implicitSingletonService1.serviceMethod();
        implicitSingletonService2.serviceMethod();

        // For singleton scope
        SingletonService singletonService1 = context.getBean("singletonService", SingletonService.class);
        SingletonService singletonService2 = context.getBean("singletonService", SingletonService.class);
        singletonService1.serviceMethod();
        singletonService2.serviceMethod();

        // For prototype scope
        PrototypeService prototypeService1 = context.getBean("prototypeService", PrototypeService.class);
        PrototypeService prototypeService2 = context.getBean("prototypeService", PrototypeService.class);
        prototypeService1.serviceMethod();
        prototypeService2.serviceMethod();

        context.close();
    }
}
