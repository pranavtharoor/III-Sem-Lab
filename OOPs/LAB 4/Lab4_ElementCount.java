/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Searches for an element in an array and counts its occurrences
 * @author Pranav Tahroor
 */
public class Lab4_ElementCount {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimention: ");
        int m = in.nextInt(), n = in.nextInt();
        System.out.println("Enter matrix:");
        int[][] a = new int[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = in.nextInt();
        System.out.print("Enter element to count: ");
        int e = in.nextInt();
        int count = 0;
        for(int i = 0; i < m; i++)
            for(int j =0; j <n; j++)
                if(a[i][j] == e) count++;
        System.out.println("Count: " + count);
    }
}
