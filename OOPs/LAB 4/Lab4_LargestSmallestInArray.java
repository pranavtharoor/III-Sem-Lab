/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * To find the largest and smallest elements in an array
 * @author Pranav Tharoor
 */
public class Lab4_LargestSmallestInArray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array");
        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int s = a[0], l = a[0];
        for(int i = 0; i < n; i++) {
            if(a[i] < s) s = a[i];
            if(a[i] > l) l = a[i];
        }
        System.out.println("Largest: " + l);        
        System.out.println("Smallest: " + s);

    }
}
