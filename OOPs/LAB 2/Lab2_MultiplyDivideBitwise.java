/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Does bitwise multiplication and division
 * @author Pranav Tharoor
 */
public class Lab2_MultiplyDivideBitwise {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        System.out.println("Number multiplied by 2:" + (a << 1));
        System.out.println("Number divided by 2: " + (a >> 1));
    }
}
