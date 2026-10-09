package org.example;

public class Main {
    public static void main(String[] args) {

        // Create an object of Calculator
        Calculator calculator = new Calculator();

        // Test addition
        System.out.println("Addition: " + calculator.add(10, 5));

        // Test subtraction
        System.out.println("Subtraction: " + calculator.subtract(10, 5));

        // Test multiplication
        System.out.println("Multiplication: " + calculator.multiply(10, 5));

        // Test division
        System.out.println("Division: " + calculator.divide(10, 5));
    }
}