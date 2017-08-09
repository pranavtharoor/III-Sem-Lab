/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Finds largest and smallest
 * @author Pranav Tharoor
 */
public class Lab2_TernaryOperator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out.println("Largest: " + (a > b ? (a > c ? a : c) : (b > c ? b : c)));
        System.out.println("Smallest: " + (a < b ? (a < c ? a : c) : (b < c ? b : c)));
    }
}
