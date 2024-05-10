package Railworld.Day08;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String location;
    private ArrayList<String> branches;

    public Bank(String name, String location) {
        this.name = name;
        this.location = location;
        this.branches = new ArrayList<>();
    }

    public Bank() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void addBranch(String branchName){
        branches.add(branchName);
        System.out.println("Branch "+branchName+" added Successfully !");
    }
    public void listBranches(){
        System.out.println("Brnaches of "+name+" bank : ");
        for(String branch : branches){
            System.out.println("- "+branch);
        }
    }
}
