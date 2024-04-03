package com.coherentsolutions.section11;

public class GlobalSessionScopedBean {
    public void serviceMethod() {
        System.out.println("GlobalSessionScopedBean instance: " + this.hashCode());
    }
}
