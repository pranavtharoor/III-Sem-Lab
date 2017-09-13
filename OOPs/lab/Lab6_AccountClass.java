/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Tracks customer savings details
 * @author Pranav Tharoor
 */

class Account {
    int accNo;
    String name, accType;
    double balance;
    
    // Initializes account details
    public Account(int accNo, String name, int type) {
        this.accNo = accNo;
        this.name = name;
        this.accType = type == 1 ? "Savings":"Current";
        balance = 0;
    }
    
    // Returns balance in account
    public double getBalance() {
        return balance;
    }

    // Returns account number
    public int getAccNo() {
        return accNo;
    }

    // Returns account name
    public String getName() {
        return name;
    }

    // Returns account type
    public String getAccType() {
        return accType;
    }

    // Adds to account to the accoutn balance
    public void deposit(double balance) {
        this.balance += balance;
    }
    
    // Reduces from the account balance
    public void withdraw(double balance) {
        if(this.balance - balance < 0) System.out.println("Not enough balance");
        else this.balance -= balance;
    }
}

class currentAcc extends Account {
    public currentAcc(int accNo, String name, int accType) {
        super(accNo, name, accType);
    }
}

class savingsAcc extends Account {
    public savingsAcc(int accNo, String name, int accType) {
        super(accNo, name, accType);
    }

    // Computes the interest
    void computeInterest(float interest) {
        super.balance += super.balance * interest / 100.0;
    }
}

public class Lab6_AccountClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account number, name and account type (1: Current, 2: Savings)");
        int accNo = in.nextInt();
        String name = in.next();
        int type = in.nextInt();
        currentAcc cac1 = new currentAcc(accNo, name, type);
        savingsAcc sac1 = new savingsAcc(accNo, name, type);
        
        System.out.println("Account number: " + cac1.getAccNo());
        System.out.println("Name: " + cac1.getName());
        System.out.println("Account Type: " + cac1.getAccType());
        if(type == 1) {
            do {
                System.out.println("1: Deposit\n2: Withdraw");
                int choice = in.nextInt();
                if(choice == 1) {
                    System.out.print("Enter deposit ammount: ");
                    cac1.deposit(in.nextDouble());
                }
                else if(choice == 2) {
                    System.out.print("Enter ammount to withdraw: ");
                    cac1.withdraw(in.nextDouble());
                }
                else System.out.println("Invalid");
                System.out.println("Balance: " + cac1.getBalance());
                System.out.print("Continue? (y/n)");
            } while(in.next().charAt(0) != 'n');
        } else if(type == 2) {
            do {
                System.out.println("1: Deposit\n2: Withdraw\n3: Compute Interest");
                int choice = in.nextInt();
                if(choice == 1) {
                    System.out.print("Enter deposit ammount: ");
                    sac1.deposit(in.nextDouble());
                }
                else if(choice == 2) {
                    System.out.print("Enter ammount to withdraw: ");
                    sac1.withdraw(in.nextDouble());
                }
                else if(choice == 3) {
                    System.out.print("Enter interest: ");                    
                    sac1.computeInterest(in.nextFloat());
                }
                else System.out.println("Invalid");
                System.out.println("Balance: " + sac1.getBalance());
                System.out.print("Continue? (y/n)");
            } while(in.next().charAt(0) != 'n');
        } else System.out.println("Invalid");
    }
}
