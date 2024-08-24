package org.bankAccountApp;

import org.bankAccountApp.utilities.CSVReader;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
//        Account savingAccount = new Savings("Raj", 1000, "2345");
//        Account checkingAccount = new Checking("Simran", 2000, "7864");
//        savingAccount.showInfo();
//        checkingAccount.showInfo();
//        savingAccount.deposit(2000);
//        savingAccount.withdraw(50);
//        savingAccount.transfer(1000, "Brokerage");
//        savingAccount.getCompound();
        List<Account>  accounts = new LinkedList<>();
        String file = "C:\\Users\\rahparmar\\Documents\\JavaProjects\\NewBankAccounts.csv";
        List<String[]> accountsDetails = CSVReader.readCSVFile(file);
        for(String[] accountDetails : accountsDetails) {
            String accountName = accountDetails[0];
            String sSN = accountDetails[1];
            String accountType = accountDetails[2];
            int initialDeposit = Integer.parseInt(accountDetails[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(accountName, initialDeposit, sSN));
            }else if (accountType.equals("Checking")) {
                accounts.add(new Checking(accountName, initialDeposit, sSN));
            }else {
                System.out.println("Invalid account type");
            }
        }

        for (Account account : accounts) {
            System.out.println("\n================");
            account.showInfo();
        }
    }
}

