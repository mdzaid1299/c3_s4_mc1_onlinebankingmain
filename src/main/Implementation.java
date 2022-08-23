package main;


import data.RecurringDeposit;
import data.SavingsAccount;

public class Implementation {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(23456785L,"Raju",70000,"Active","05/06/2027","Self",true,3);
        RecurringDeposit rd = new RecurringDeposit(34565657767766L,"Babita",5000,"Active","05/06/2027","Self",true,10000,14000,10,4);
        double rest1 = sa.calculateInterest();
        System.out.println("Savings Account interest calculation = " + rest1);
        double rest2 = rd.calculateInterest();
        System.out.println("Reccuring deposit interest calculation = " + rest2);
        System.out.println("Displaying Operations performed by savings account  ");
        System.out.println();
        System.out.println("Check Balance = " + sa.checkBalance());
        System.out.println("credit Balance = " + sa.creditBalance(5000));
        System.out.println("debit Balance = " + sa.debitBalance(3000));



    }

}