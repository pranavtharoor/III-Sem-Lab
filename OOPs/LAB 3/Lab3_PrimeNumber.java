/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Prints prime numbers in given range
 * @author Pranav Tharoor
 */
public class Lab3_PrimeNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter range:");
        int m = in.nextInt();
        int n = in.nextInt();
        boolean flag;
        System.out.println("Prime numbers:");
        for(int i = m; i < n; i++) {
            flag = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0)
                    flag = false;
            }
            if(flag && i > 1)
                System.out.print(i + " ");
        }
    }
}
