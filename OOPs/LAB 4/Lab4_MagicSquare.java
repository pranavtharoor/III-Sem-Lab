/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Checks if a matrix is a magic square or not
 * @author Pranav Tharoor
 */
public class Lab4_MagicSquare {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimention of square: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = in.nextInt();
        int sum = 0;
        boolean flag = true;
        for(int i = 0; i < n; i++)
            sum += a[i][0];
        int s1 = 0, s2 = 0, ds1 = 0, ds2 = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) ds1 += a[i][j];
                if(n - i - 1 == j) ds2 += a[i][j];
                s1 += a[i][j];
                s2 += a[j][i];
            }
            if(s1 != sum || s2 != sum) {
                flag = false;
                break;
            }
            s1 = s2 = 0;
        }
        if(ds1 != sum || ds2 != sum) flag = false;
        if(flag) System.out.println("Matrix is a magic square");
        else System.out.println("Matrix is not a magic square");
    }
}
