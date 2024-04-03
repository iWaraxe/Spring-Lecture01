package com.coherentsolutions.section09;

public class AppConfig {
    private String appName;
    private double appVersion;
    private boolean isDebugMode;

    // Setter methods for Spring to inject the properties
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAppVersion(double appVersion) {
        this.appVersion = appVersion;
    }

    public void setIsDebugMode(boolean isDebugMode) {
        this.isDebugMode = isDebugMode;
    }

    // Method to print the configuration
    public void printConfig() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
        System.out.println("Is Debug Mode: " + isDebugMode);
    }
}
