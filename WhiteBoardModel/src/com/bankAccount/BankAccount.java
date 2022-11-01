package com.bankAccount;

import java.time.LocalDateTime;
import java.util.Random;

public class BankAccount {

    // instance variables
    private String accountNumber;
    private AccountType accountType;
    private String accountOwner;
    private double checkingBalance;
    private double savingBalance = 200;
    private static int totalAccountsCreated = 0;
    private static final double MINIMUM_BALANCE = 25.0;
    LocalDateTime withdrawTime = LocalDateTime.now();

    // constructors
    public BankAccount() {

    }

    public BankAccount(String accountOwner, double checkingBalance, double savingBalance, AccountType accountType) {
        setAccountOwner(accountOwner);
        setAccountNumber(getAccountNumber());
        setAccountType(accountType);
        setCheckingBalance(checkingBalance);
        setSavingBalance(savingBalance);
        totalAccountsCreated++;
    }

    // business logics
    public void depositChecking(double amount) {
        this.checkingBalance += amount;
    }

    public void withdrawChecking(double amount) {
        if (checkingBalance >= amount) {
            this.checkingBalance -= amount;
            System.out.printf("\nAccountOwner: %s \nDate and Time of your withdraw from Checking Account: %s\n", getAccountOwner(), withdrawTime);

        } else {
            System.out.printf("Hi %s! Insufficient Funds. Your current balance is  $%s! \n", getAccountOwner(), getCheckingBalance());
        }
    }

    public void depositSavingsAccount(double amount) {
        this.savingBalance += amount;
    }

    public void withdrawSavings(double amount) {

        if (savingBalance >= amount) {
            this.savingBalance -= amount;
            System.out.printf("\nAccountOwner: %s \nDate and Time of your withdraw from Saving Account: %s\n", getAccountOwner(), withdrawTime);
        } else {
            System.out.printf("\n%s Account Info! Insufficient Funds. Your current balance is $%s!\n", getAccountOwner(), getSavingBalance());
        }
    }

    public double totalBalance() {
        return getCheckingBalance() + getSavingBalance();
    }

    public void displayAccountInfo() {
        System.out.printf("\n%s's Account Info!\nYour Checking Balance is: $%s\nYour Saving Balance is: $%s \nTotal Balance: $%s \nAccount number: %s\nAccount Type: %s\n",
                getAccountOwner(), getCheckingBalance(), getSavingBalance(), totalBalance(), getAccountNumber(), getAccountType());
    }

    public static void displayNumberOfAccounts() {
        System.out.printf("\n********** Total number of Bank Accounts created: %s **********\n", getTotalAccountsCreated());
    }

    public static AccountType accountTypeConversion(String accountType) {
        if (accountType.equalsIgnoreCase("individual")) {
            return AccountType.individual;
        }
        if (accountType.equalsIgnoreCase("joint")) {
            return AccountType.joint;
        }
        return null;

    }

    // accessors
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {

        try {
            if (checkingBalance < MINIMUM_BALANCE) {
                throw new MinimumBalanceException("\nSorry! You must have a minimum balance of $"+ MINIMUM_BALANCE +"! Please deposit higher amounts!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.checkingBalance = checkingBalance;
    }


    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance += savingBalance;
    }

    public static int getTotalAccountsCreated() {
        return totalAccountsCreated;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }


    public String getAccountOwner() {
        return accountOwner;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        String accountNumber = "";
        Random random = new Random();
        String numberString = "0123456789";
        char[] numbersArray = numberString.toCharArray();
        for (int i = 0; i < numbersArray.length; i++) {
            int randIndex = random.nextInt(numberString.length());
            accountNumber += numbersArray[randIndex];
        }
        return accountNumber;
    }


}
