package com.coherentsolutions.section08;
public class AppConfig {
    private String appName;
    private int appVersion;
    private boolean isDebugMode;

    // Setter methods for dependency injection
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setAppVersion(int appVersion) {
        this.appVersion = appVersion;
    }

    public void setIsDebugMode(boolean isDebugMode) {
        this.isDebugMode = isDebugMode;
    }

    public void printConfig() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
        System.out.println("Is Debug Mode: " + isDebugMode);
    }
}
