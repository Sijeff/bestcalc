package com.company;

public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }




    public double multiply(double x, double y, double z) {
        System.out.println("More is more");
        return x * y * z;
    }



    public void evenNumber(int x) {
        if (x%2 == 0) {
            System.out.println("Jajjamen!");
        }
        else
        {
            System.out.println("Men ajjabajja då!");
        }
    }





    public double subtraction(double x, double y) {
        return x - y;
    }


    public double divide(double x, double y) {
        return x / y;
    }

    private double sqrt (double num) throws IllegalArgumentException {
        double res=0;
        if (num<0) {
            throw new IllegalArgumentException("Nein");
        }

        res = Math.sqrt(num);
        return res;
    }

    public double square(double x) {
        return x * x;
    }
    

}
