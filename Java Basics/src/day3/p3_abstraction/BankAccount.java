package day3.p3_abstraction;

abstract public class BankAccount {
    private String accountNumber;
    private double balance;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
