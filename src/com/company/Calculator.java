package com.company;

public class Calculator {

    private double add(double x, double y) {
        return x + y;
    }
    //methods go here!


    public double multiply(double x, double y) {
        return x * y;
    }


    public int subtraction(int x, int y) {
        return x - y;
    }


    public int divide(int x, int y) {
        return x / y;
    }

    public double sqrt ( double num) throws IllegalArgumentException {
        double res = Math.sqrt(num);
        return res;
    }
}
