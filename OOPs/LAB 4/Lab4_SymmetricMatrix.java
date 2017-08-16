/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * To find whether a matrix is symmetric or not
 * @author Pranav Tharoor
 */
public class Lab4_SymmetricMatrix {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimention: ");
        int n = in.nextInt();
        boolean flag = true;
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix:");
        for(int i = 0; i < n; i++)
            for(int j =0; j < n; j++)
                mat[i][j] = in.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(mat[i][j] != mat[j][i])
                    flag = false;
        if(flag) System.out.println("Symmetric");
        else System.out.println("Not symmetric");
    }
}
