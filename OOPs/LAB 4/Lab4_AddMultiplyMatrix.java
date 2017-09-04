/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package lab;

import java.util.Scanner;

/**
 * Adds and multiplies 2 given matrices
 * @author Pranav Tharoor
 */
public class Lab4_AddMultiplyMatrix {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimentions of first matrix");
        int m1 = in.nextInt(), n1 = in.nextInt();
        System.out.println("Enter dimentions of second matrix");
        int m2 = in.nextInt(), n2 = in.nextInt();
        int[][] a = new int[m1][n1];
        int[][] b = new int[m2][n2];
        int[][] c = new int[m1][n2];
        int s;
        System.out.println("Enter first matrix");
        for(int i =0; i < m1; i++)
            for(int j = 0; j < n1; j++)
                a[i][j] = in.nextInt();
        System.out.println("Enter second matrix");
        for(int i =0; i < m2; i++)
            for(int j = 0; j < n2; j++)
                b[i][j] = in.nextInt();
        if(n1 == m2) {
            for(int i = 0; i < m1; i++)
                for(int j = 0; j < n2; j++) {
                    s = 0;
                    for(int k = 0; k < n1; k++)
                        s += a[i][k] * b[k][j];
                    c[i][j] = s;
                }
            System.out.println("Product:");
            for(int i = 0; i < m1; i++) {
                for(int j = 0; j < n2; j++)
                    System.out.print(c[i][j] + " ");
                System.out.println();
            }
        } else System.out.println("Cannot multiply matrices");
        if(m1 == m2 && n1 == n2) {
            for(int i = 0; i < m1; i++)
                for(int j = 0; j < n1; j++)
                    c[i][j] = a[i][j] + b[i][j];
            System.out.println("Sum:");
            for(int i = 0; i < m1; i++) {
                for(int j = 0; j < n1; j++)
                    System.out.print(c[i][j] + " ");
                System.out.println();
            }
        } else System.out.println("Cannot add matrices");
    }
}
