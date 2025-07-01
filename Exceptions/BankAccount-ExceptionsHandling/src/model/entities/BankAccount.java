package model.entities;

import model.exceptions.WithdrawException;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public BankAccount(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new WithdrawException("Withdraw limit exceed.");
        }
        if (amount > getBalance()) {
            throw new WithdrawException("Withdraw value exceeds current balance.");
        }
        this.balance -= amount;
    }
}
