package com.company;

import java.util.Scanner;

public class UserInterface {
    private void evaluateOperation(Calculator calc, String operation, double x, double y) {

        operation = operation.toLowerCase();

        switch(operation) {
            case "add":
                calc.add(x, y);
            case "subtract":
                calc.subtraction(x, y);
            case "divide":
                calc.divide(x, y);
            case "multiply":
                calc.multiply(x, y);
            case "square":
                calc.square(x);
            case "root":
                calc.sqrt(x);
            default:
                System.out.println("Not a valid operation. Enter one of: ");
                System.out.println("Add, Subtract, Divide, Multiply, Square, Root");
        }

    }

    private double scanDouble(Scanner scan){
        double output = scan.nextDouble();
        scan.nextLine();
        return output;
    }

    private void getInput(Calculator calc) {
        double x, y;
        String operation = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        x = scanDouble(scan);
        System.out.println("Please enter second number");
        y = scanDouble(scan);
        System.out.println("What do you want to do?");
        operation = scan.nextLine();
        evaluateOperation(operation, x, y);
    }

    public void run(UserInterface ui) {
        Calculator calc = new Calculator();
        ui.getInput(calc);
    }
}
