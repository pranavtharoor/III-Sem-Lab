/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Checks type of number
 * @author Pranav Tharoor
 */

class Number {
    double n;
    
    // Initializes number
    Number(double n) {
        this.n = n;
    }
    
    // Checks for zero
    public boolean isZero() {
        if(n == 0) return true;
        return false;
    }
    
    // Checks if positive
    public boolean isPositive() {
        if(n > 0) return true;
        return false;
    }
    
    // Checks if negative
    public boolean isNegative() {
        if(n < 0) return true;
        return false;
    }
    
    // Checks if odd
    public boolean isOdd() {
        if(n % 2 != 0) return true;
        return false;
    }
    
    // Checks if even
    public boolean isEven() {
        if(n % 2 == 0) return true;
        return false;
    }
    
    // Checks if prime
    public boolean isPrime() {
        boolean flag = true;
        for(int i = 2; i <= n / 2; i++)
            if(n % i == 0) flag = false;
        if(flag && n > 1 && n == (int) n) return true;
        return false;
    }
    
    // Checks if the number is an Armstrong number
    public boolean isArmstrong() {
        int t = (int) n;
        int sum = 0;
        do {
            sum += Math.pow((t % 10), 3);
            t /= 10;
        } while(t > 0);
        if(sum == n) return true;
        return false;
    }
}

public class Lab5_NumberClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        Number n = new Number(in.nextDouble());
        if(n.isZero()) System.out.println("Number is zero");
        if(n.isPositive()) System.out.println("Number is positive");
        if(n.isNegative()) System.out.println("Number is negative");
        if(n.isOdd()) System.out.println("Number is odd");
        if(n.isEven()) System.out.println("Number is even");
        if(n.isPrime()) System.out.println("Number is a prime number");
        if(n.isArmstrong()) System.out.println("Number is an armstrong number");
    }
}
