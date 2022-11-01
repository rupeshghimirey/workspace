package client;


import bankAccount.AccountType;
import bankAccount.BankAccount;

public class BankAccountClient {

    public static void main(String[] args) {

        BankAccount viaanAccount = new BankAccount("Viaan", 50, 200, AccountType.individual);

        BankAccount mahimaAndRupeshAccount = new BankAccount("Mahima and Rupesh", 1200, 500, AccountType.joint);


        viaanAccount.withdrawChecking(22);
        viaanAccount.depositChecking(150);
        viaanAccount.depositSavingsAccount(150);
        viaanAccount.withdrawSavings(140);
        viaanAccount.displayAccountInfo();


        mahimaAndRupeshAccount.depositChecking(11);
        mahimaAndRupeshAccount.depositSavingsAccount(55);
        mahimaAndRupeshAccount.withdrawChecking(100);
        mahimaAndRupeshAccount.withdrawSavings(45);
        mahimaAndRupeshAccount.displayAccountInfo();

        BankAccount.displayNumberOfAccounts();
    }

}
