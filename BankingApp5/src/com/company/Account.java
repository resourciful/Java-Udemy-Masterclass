package com.company;

import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private ArrayList<Double>transactionList;
    private double balance;
    private String customerName;

    public Account(String customerName, int accountNumber) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }


    public double getBalance(){
        double balanceTotal = 0;
        for (int i = 0; i<transactionList.size(); i++) {
            balanceTotal += transactionList.get(i);
        }
        System.out.println("The balance is now " + balanceTotal);
            return balanceTotal;
        }


    public void addTransaction(double amount){
        this.transactionList.add(amount);
        System.out.println("Transaction added");
    }

    public void listTransactions(){
       for (int i = 0; i<transactionList.size(); i++){
           System.out.println("[" +(i+1) + "] Amount " + transactionList.get(i));
       }
    }


}
