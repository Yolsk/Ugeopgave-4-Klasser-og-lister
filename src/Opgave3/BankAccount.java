package Opgave3;

import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transactions.add(new Transaction("Deposit", amount));
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            transactions.add(new Transaction("Withdrawal", amount));
        } else {
            System.out.println("Not enough money on the bankaccount");
        }
    }
    void printTransactionHistory() {
        System.out.println("Transaction history");

        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
    double getBalance() {
        return balance;
    }


}

