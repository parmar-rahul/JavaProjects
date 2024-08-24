package org.bankAccountApp;

public class Savings extends Account {
    private int safetyDepositNumber;
    private int safetyDepositKey;

    public Savings(String name, int intialDeposit, String sSN) {
        super(name, intialDeposit, sSN);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setInterestRate() {
        this.interestRate = getBaseRate() - 0.25;
    }

    public void setSafetyDepositBox(){
        safetyDepositNumber = (int)(Math.random() * Math.pow(10,4));
        safetyDepositKey = (int)(Math.random() * Math.pow(10,3));
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("Safety Deposit Number: " + safetyDepositNumber);
        System.out.println("Safety Deposit Key: " + safetyDepositKey);
    }

    //Safe deposit box

}
