package com.company;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer>customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i<customerList.size(); i++){
            Customer foundCustomer = customerList.get(i);
            if(foundCustomer.getCustomerName().equals(customerName)){
                return foundCustomer;
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    public Customer addCustomer(String customerName){  //changed type to Customer
        if(findCustomer(customerName) == null){
            this.customerList.add(new Customer(customerName));
            System.out.println("Customer as been added - Branch");
            return this.customerList.get(this.customerList.size()-1); //changed return to last customer added.
        }
        System.out.println("Customer can not be added because they already exist - Branch");
        return null;
    }

    public void printCustomerList(){
        for (int i = 0; i<customerList.size(); i++){
            System.out.println("Customer " + (i+1) + ": " + customerList.get(i).getCustomerName());
        }
    }


}
