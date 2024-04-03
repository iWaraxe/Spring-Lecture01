package com.coherentsolutions.section11;

public class RequestScopedBean {
    public void serviceMethod() {
        System.out.println("RequestScopedBean instance: " + this.hashCode());
    }
}
