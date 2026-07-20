package org.example;

public class CollegeConfig {

    private static CollegeConfig instance;

    private final String collegeName;
    private final String systemVersion;

    // Private constructor
    private CollegeConfig() {
        collegeName = "ABC College";
        systemVersion = "1.0";
    }

    // Returns the single instance
    public static CollegeConfig getInstance() {
        if (instance == null) {
            instance = new CollegeConfig();
        }
        return instance;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getSystemVersion() {
        return systemVersion;
    }
}