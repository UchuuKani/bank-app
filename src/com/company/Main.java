package com.company;
import java.util.Scanner; // we import the Scanner class to take input from a user in a CLI

// don't have to import TestClass to use it since it's within the same package as the Main class

public class Main {

    public static void main(String[] args) {
        BankingApplication bankApp = new BankingApplication("Steve", "X1234Z");
        bankApp.showMenu();
    }

    private static void testScanner() {
        Scanner scanner = new Scanner(System.in); // an instance of the Scanner class expects an input stream source?
        // in this case, we designate System.in as the input?
        System.out.println("input a number");
        int userInInt = scanner.nextInt(); // grabs user input that is an int. Errors out if input can't be converted to an int
        System.out.println("user input is equal to " + userInInt);

        System.out.println("input a string");
        char userInChar = scanner.next().charAt(0); // the next() method only accepts strings? so we have to take the first char
        // at index 0
        System.out.println("user string input is equal to " + userInChar);
    }
}
