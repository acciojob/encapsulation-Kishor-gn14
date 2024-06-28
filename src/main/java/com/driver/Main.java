package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        // rwOnly.name = "Kishor"; // This line will cause an error
        // System.out.println(rwOnly.name); // This line will cause an error

        rwOnly.setName("Kishor");
        System.out.println(rwOnly.getName());
    }
}
