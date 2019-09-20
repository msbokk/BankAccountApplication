package bankaccountapp;

import java.util.Random;

public abstract class Account implements IBaseRate {
    //properties for accounts common to current and savings

    protected String name;
    protected String adhaar;
    protected String accountNumber;
    protected double rate;
    protected double balance;
    private static int index = 10000;

    //constructor
    public Account(String name, String adhaar, double initialDeposit) {
        this.name = name;
        this.adhaar = adhaar;
        this.balance = initialDeposit;
        this.accountNumber = setAccountNumber();
        setRate();

    }

    public abstract void setRate();

    //methods common to both savings and current
    private String setAccountNumber() {
        index++;
        String lastTwoDigitOfAdhaar = this.adhaar.substring(adhaar.length() - 2);
        //int randNum= (int) ((int) Math.random()*Math.pow(1000, 1));
        Random random = new Random();

        // generate a random integer from 0 to 899, then add 100
        int randNum = random.nextInt(900) + 100;
        return lastTwoDigitOfAdhaar + index + randNum;
    }

    public String interest() {
        double interest = balance * (rate / 100);
        balance = balance + interest;
        return ("Interest is " + interest + "Rs");

    }

    public String showInfo() {
        return ("Name: " + name
                + "\nAccount Number: " + this.accountNumber
                + "\nAdhaar: " + adhaar
                + "\nBalance: " + balance
                + "\nRate: " + rate + "%"
                + "\n");

    }

    public void deposit(double amount) {
        balance = balance + amount;

    }

    public void withdraw(double amount) {
        balance = balance - amount;

    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;

    }

    public String showBalance() {
        return ("Your balance now is " + balance + "\n");
    }

}
