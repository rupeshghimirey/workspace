package com.bankAccount.client;

import com.bankAccount.AccountType;
import com.bankAccount.BankAccount;

public class BankAccountClientArgs {

    public static void main(String[] args) {
        if (args.length < 3) {
            String usage = "com.bankAccount.client.BankAccountClientArgs <accountOwner> <checkingBalance> <saving Balance> <accountType>";
            String example = "Example: com.bankAccount.client.BankAccountClientArgs Rupesh 100 200 individual";
            String note = "Note: supported account types are 'individual' and 'joint'";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }

        System.out.println("You provided " + args.length + " arguments");

        String accountOwner = args[0];
        double checkingBalance = Double.parseDouble(args[1]);
        double savingBalance = Double.parseDouble(args[2]);
        AccountType accountType = BankAccount.accountTypeConversion(args[3]);

        BankAccount bankAccount1 = new BankAccount(accountOwner, checkingBalance, savingBalance, accountType);
        bankAccount1.displayAccountInfo();
    }
}
