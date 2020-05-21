package com.demo.example.constant;

public enum Subject {

    BURMESE("Burmese"),

    ENGLISH("English"),

    MATH("Math"),

    CHEMISTRY("Chemistry"),

    PHYSICS("Physics"),

    BIOLOGY("Biology");

    public final String value;

    private Subject(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
