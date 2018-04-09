package com.company;

public class Main {


    public static void main(String[] args) {
        while (true) {
            UserInterface ui = new UserInterface();
            ui.run(ui);
        }
    }
}
