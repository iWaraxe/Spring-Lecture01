package com.coherentsolutions.section11;

public class SessionScopedBean {
    public void serviceMethod() {
        System.out.println("SessionScopedBean instance: " + this.hashCode());
    }
}
