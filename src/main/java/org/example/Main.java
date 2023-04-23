package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int add(int a, int b) {
        if (a <= 0 && b <= 0) {
            System.out.println(" You can't add two negative numbers ");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / (double) b;
    }

    public double squareRootOf(double a) {
        if (a < 0) {

            System.out.println("Your value is a NoN value, please enter a positive number ");
            return Double.NaN;
        }

        return Math.sqrt(a);

    }

}