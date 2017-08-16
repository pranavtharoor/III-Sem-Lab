/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * To find trace and norm of a given matrix
 * @author Pranav Tharoor
 */
public class Lab4_TraceNorm {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter dimention: ");
        int n = in.nextInt();
        int trace = 0;
        int[][] mat = new int[n][n];
        int sqsum = 0;
        System.out.println("Enter matrix:");
        for(int i = 0; i < n; i++)
            for(int j =0; j < n; j++)
                mat[i][j] = in.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    trace += mat[i][j];
                }
                sqsum += Math.pow(mat[i][j], 2);
            }
        }
        System.out.println("Trace= " + trace);
        System.out.println("Norm= " + Math.sqrt(sqsum));
    }
}
