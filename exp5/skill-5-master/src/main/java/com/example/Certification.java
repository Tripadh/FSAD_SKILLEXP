package com.example;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 501;
    private String name = "Java Spring";
    private String dateOfCompletion = "2026";

    public void display() {
        System.out.println("Certification ID: " + id);
        System.out.println("Certification Name: " + name);
        System.out.println("Completion Year: " + dateOfCompletion);
    }
}
