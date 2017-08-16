/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * To merge and sort two arrays
 * @author Pranav Tharoor
 */
public class Lab4_MergeAndSortArrays {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of first array: ");
        int n1 = in.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter first array");
        for(int i = 0; i < n1; i++)
            a[i] = in.nextInt();
        System.out.print("Enter length of second array: ");
        int n2 = in.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter second array");
        for(int i = 0; i < n2; i++)
            b[i] = in.nextInt();
        int[] c = new int[n1 + n2];
        for(int i = 0; i < n1 + n2; i++)
            if(i < n1)
                c[i] = a[i];
            else
                c[i] = b[i - n1];
        System.out.println("Merged array: ");
        for(int i = 0; i < n1 + n2; i++)
            System.out.print(c[i] + " ");
        for(int i = 0; i < n1 + n2; i ++)
            for(int j = 0; j < n1 + n2 - i - 1; j++)
                if(c[j] > c[j + 1]) {
                    c[j] += c[j + 1];
                    c[j + 1] = c[j] - c[j + 1];
                    c[j] -= c[j + 1];
                }
        System.out.println("\nSorted array:");
        for(int i = 0; i < n1 + n2; i++)
            System.out.print(c[i] + " ");
    }
}
