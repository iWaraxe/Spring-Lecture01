package com.coherentsolutions.section12;

public class DatabaseBean {

    private String databaseUrl;

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void connect() {
        System.out.println("Connecting to database at " + databaseUrl);
    }

    public void disconnect() {
        System.out.println("Disconnecting from database.");
    }
}
