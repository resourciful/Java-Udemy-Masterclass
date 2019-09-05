package com.company;

public class Main {

    public static void main(String[] args) {

       Branch branch = new Branch("New Orleans");

       Customer waggs = branch.addCustomer("Waggs");
       Customer slavin = branch.addCustomer("Nicole");

       branch.printCustomerList();
       System.out.println("-----------------------");

       Account account = slavin.addAccount(1234);
       account.addTransaction(10.00);
       account.addTransaction(20.00);
       account.addTransaction(0.25);
       account.listTransactions();
       account.getBalance();
       System.out.println("-----------------------");

      Account checking = waggs.addAccount(594817);

       checking.addTransaction(15.00);
       checking.addTransaction(-5.00);
       checking.listTransactions();
       checking.getBalance();









    }


}
