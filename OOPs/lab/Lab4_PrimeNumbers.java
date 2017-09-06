/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Prints all prime numbers in an array
 * @author Pranav Tharoor
 */
public class Lab4_PrimeNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimention of array: ");
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();
        System.out.println("Prime elements:");
        for(int e:a) { // Iterates through array
            boolean flag = true;
            if(e <= 1) flag = false;
            for(int i = 2; i <= e / 2; i++)
                if(e % i == 0) flag = false; // Checks for divisibility
            if(flag) System.out.print(e + " ");
        }
    }
}
