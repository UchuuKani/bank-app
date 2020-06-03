package com.company;
import java.util.Scanner;

public class BankingApplication {
    // without a constructor, int types default to 0 and String types default to null
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankingApplication(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    private void deposit(int amount) {
        if (amount != 0) {
            this.balance += amount;
            this.previousTransaction = amount;
        }
    }

    private void withdraw(int amount) {
        if (amount != 0) {
            this.balance -= amount;
            this.previousTransaction -= amount;
        }
    }

    private void getPreviousTransaction() {
        if (this.previousTransaction > 0) {
            System.out.println("Deposited: " + this.previousTransaction);
        } else if (this.previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(this.previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }
    // method to loop user interaction in the cli
    public void showMenu() {
        char option = '\0'; // just to initialize options with a value, could have used anything or nothing?
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + this.customerName);
        System.out.println("Your ID is " + this.customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("===========================================================================");
            System.out.println("Enter an option");
            System.out.println("===========================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("----------------------------");
                    System.out.println("Balance: " + this.balance);
                    System.out.println("----------------------------");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println();
                    System.out.println("----------------------------");
                    System.out.println("Enter an amount to deposit:");
                    System.out.println("----------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("----------------------------");
                    System.out.println("Enter an amount to withdraw:");
                    System.out.println("----------------------------");
                    int amountToWithdraw = scanner.nextInt();
                    withdraw(amountToWithdraw);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("----------------------------");
                    getPreviousTransaction();
                    System.out.println("----------------------------");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("*****************************");
                    break;
                default:
                    System.out.println("Invalid option: please enter another option");
                    break;
            }
        } while (option != 'E');
    }

    public void printDefaults() {
        System.out.println("the balance " + balance);
        System.out.println("the previousTransaction " + previousTransaction);
        System.out.println("the customerName " + customerName);
        System.out.println("the customerId " + customerId);
    }
}
