package bankaccountapp;

import java.util.*;

public class Current extends Account {
    //properties specific to current account

    private int debitCardNumber;
    private int debitCardPin;

    //constructor to initialise
    public Current(String name, String adhaar, double initialDeposit) {
        super(name, adhaar, initialDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {

        rate = getRate() - .25;
    }

    //methods specific for current account
    @Override
    public String showInfo() {

        return (super.showInfo() + " Your Current Account features"
                + "\n Debit Card Number is " + debitCardNumber
                + "\n Debit Card Pin is " + debitCardPin);

    }

    

    private void setDebitCard() {
        Random random = new Random();
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = random.nextInt(9000) + 1000;
    }
}
