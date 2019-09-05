package com.company;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Account> accountList;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.accountList = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }


    public int findAccountNumber(int accountNumber){
        return accountList.indexOf(accountNumber);
    }


    public Account addAccount(int accountNumber){ //type changed to Account
        if(findAccountNumber(accountNumber) < 0){



            System.out.println("New account has been created." + this.customerName);
            this.accountList.add(new Account(this.customerName, accountNumber));

            System.out.println("Account has been added to account list.");
            return this.accountList.get(this.accountList.size()-1);
        }
        return null;
    }
}
