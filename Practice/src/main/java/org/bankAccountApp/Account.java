package org.bankAccountApp;

public abstract class Account implements IBaseRate {
    /*Common Properties
    deposit, withdraw, transfer, showinfo
     */
    String name;
    int intialDeposit;
    String sSN;
    protected String accountNumber;
    double balance;
    protected double interestRate;
    double incurredInterest;
    static int uniqueNumber = 10000;

    public abstract void setInterestRate();
    public Account(String name, int intialDeposit, String sSN) {
        this.name = name;
        balance = intialDeposit;
        this.sSN = sSN;
        this.accountNumber = getAccountNumber();
        setInterestRate();
    }

    public String getAccountNumber() {
        uniqueNumber++;
        String lastTwoDigitOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int random = (int)(Math.random() * Math.pow(10,5));
        return lastTwoDigitOfSSN + uniqueNumber + "" + random;
    }

    public void showInfo(){
        System.out.println("Name: " + name + "\nAccount Number: "
                + accountNumber + "\nBalance: " + balance);
    }

    //List Common Methods
    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited " + amount + " to " + accountNumber);
        printBalance();
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("Withdrawn " + amount + " to " + accountNumber);
        printBalance();
    }

    public void transfer(double amount, String accountNumber){
        balance -= amount;
        System.out.println("Transferred " + amount + " to " + accountNumber);
        printBalance();
    }

    private void printBalance() {
        System.out.println("Total Balance: " + balance);
    }

    public void getCompound(){
        incurredInterest = balance * (interestRate/100);
        System.out.println("Interest Earn : " + incurredInterest);
        balance = balance + incurredInterest;
        printBalance();
    }

}
