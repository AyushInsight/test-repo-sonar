package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Unused variable
        int unusedVar = 42;

        // Possible NPE
        String str = null;
        if (str.equals("test")) {
            System.out.println("This is a test.");
        }

        // Inefficient looping
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("Item " + i);
        }

        // Unnecessary use of BigDecimal for small numbers
        java.math.BigDecimal bd = new java.math.BigDecimal(0.1);
        System.out.println(bd);
    }

    // Method never used
    private static void unusedMethod() {
        System.out.println("This method is never used.");
    }
}
