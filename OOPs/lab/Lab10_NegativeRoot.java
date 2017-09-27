/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Checks negative root of a number
 * @author Pranav Tharoor
 */

class NegativeRootException extends Exception {
    public NegativeRootException() {
        super();
    }
}

public class Lab10_NegativeRoot {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        try {
            checkNum(a);
            System.out.println(Math.pow(a, 0.5)); // Runs only if number is positive
        } catch(NegativeRootException e) {
            System.out.println("Cannot find root of negative number");
        }
    }
    public static void checkNum(int n) throws NegativeRootException{
        if(n < 0) throw new NegativeRootException(); // Throws exception if number is negative
    }
}




