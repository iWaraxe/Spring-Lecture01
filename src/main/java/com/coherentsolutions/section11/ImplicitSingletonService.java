package com.coherentsolutions.section11;

public class ImplicitSingletonService {
    public void serviceMethod() {
        System.out.println("ImplicitSingletonService instance: " + this.hashCode());
    }
}