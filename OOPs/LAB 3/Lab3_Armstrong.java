package lab;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Checks if a number is an Armstrong number
 * @author Pranav Tharoor
 */
public class Lab3_Armstrong {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt(), sum = 0;
        int temp = n;
        while(n > 0) {
            sum += Math.pow((n % 10), 3);
            n /= 10;
        }
        if(sum == temp)
            System.out.println("Armstrong number");
        else 
            System.out.println("Not Armstrong number");
    }
}
