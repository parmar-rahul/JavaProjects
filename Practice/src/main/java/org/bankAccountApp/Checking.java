package org.bankAccountApp;

public class Checking extends Account {

    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name, int intialDeposit, String sSN) {
        super(name, intialDeposit, sSN);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    @Override
    public void setInterestRate() {
        this.interestRate = getBaseRate() * 0.15;
    }
    public void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Debit Card Number: " + debitCardNumber);
        System.out.println("Debit Card Pin: " + debitCardPin);
    }
    //debit card
}
