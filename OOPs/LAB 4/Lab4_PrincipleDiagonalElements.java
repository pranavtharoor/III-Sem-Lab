/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Prints principle diagonal elements and their sum
 * @author Pranav Tharoor
 */
public class Lab4_PrincipleDiagonalElements {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimention: ");
        int n = in.nextInt();
        int sum = 0;
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix:");
        for(int i = 0; i < n; i++)
            for(int j =0; j < n; j++)
                mat[i][j] = in.nextInt();
        System.out.println("Principle diagonal elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                if(i == j) {
                    System.out.print(mat[i][j] + " ");
                    sum += mat[i][j];
                }
                else
                    System.out.print("  ");
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}
