/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Performs type conversion 
 * @author Pranav Tharoor
 */
public class Lab2_TypeConversion {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int a = in.nextInt();
        System.out.println("Byte: " + (byte) a);
        System.out.print("Enter double: ");
        double b = in.nextDouble();
        System.out.println("Byte: " + (byte) b + "\nInt :" + (int) b);
        System.out.print("Enter char: ");
        char c = in.next().charAt(0);
        System.out.println("Int: " + (int) c);
    }
}
