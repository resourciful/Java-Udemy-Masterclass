package com.company;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch>branchList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchList = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranchList() {
        return branchList;
    }

    private Branch findBranch(String branchName){
        for (int i = 0; i<branchList.size(); i++) {
            Branch foundBranch = this.branchList.get(i);
            if(foundBranch.getBranchName().equals(branchName)){
                return foundBranch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branchList.add(new Branch(branchName));
            System.out.println("Branched added - Bank");
            return true;
        }
        System.out.println("Branch already exists - Bank");
        return false;
    }
}
