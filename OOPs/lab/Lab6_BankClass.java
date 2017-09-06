/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * To get rate of interest of various banks
 * @author Pranav Tharoor
 */

class Bank {
    public int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    @Override
    public int getRateOfInterest() {
        return 9;
    }
}

public class Lab6_BankClass {
    public static void main(String args[]) {
        SBI a = new SBI();
        System.out.println(a.getRateOfInterest());
    }
}
