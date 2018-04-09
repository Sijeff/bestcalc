package com.company;

import java.util.Scanner;

public class UserInterface {
    private void evaluateOperation(String operation, double x, double y) {

    }
    private void getInput(Calculator calc) {
        double x, y;
        String operation = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        x = scan.nextDouble();
        System.out.println("Please enter second number");
        y = scan.nextDouble();
        System.out.println("What do you want to do?");
        operation = scan.nextLine();
        evaluateOperation(operation, x, y);
    }

    public void run(UserInterface ui) {
        Calculator calc = new Calculator();
        ui.getInput(calc);
    }
}
