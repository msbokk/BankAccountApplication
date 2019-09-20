package bankaccountapp;

import java.util.*;

public class Savings extends Account {
    //properties specific to savings account

    private int safetyDepositBoxId;
    private int safetyDepositBoxPin;
    //constructor to initialise

    public Savings(String name, String adhaar, double initialDeposit) {
        super(name, adhaar, initialDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {

        rate = getRate() * .15;
    }

    //methods specific for savings account
    public String showInfo() {

        return (super.showInfo() + " Your Savings Account Features"
                + "\n Safety Deposit Box Id is " + safetyDepositBoxId
                + "\n Safety Deposit Box Pin is " + safetyDepositBoxPin);

    }

    public String returnInfo() {

        return ("Name: " + name
                + ", Account Number: " + accountNumber
                + ", Adhaar: " + adhaar
                + ", Balance: " + balance
                + ", Rate: " + rate + "%"
                + ", Your Savings Account Features"
                + ", Safety Deposit Box Id is " + safetyDepositBoxId
                + ", Safety Deposit Box Pin is " + safetyDepositBoxPin);

    }

    private void setSafetyDepositBox() {
        Random random = new Random();

        safetyDepositBoxId = random.nextInt(900) + 100;
        safetyDepositBoxPin = random.nextInt(900) + 100;
    }

}
