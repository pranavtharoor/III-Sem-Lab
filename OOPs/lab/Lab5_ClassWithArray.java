/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Performs operations on an array
 * @author Pranav Thaoor
 */

class IntArray {
    int[] a = new int[10];
    Scanner in = new Scanner(System.in);
    public void setArray() {
        System.out.println("Enter 10 elements");
        for(int i = 0; i < 10; i++)
            a[i] = in.nextInt();
    }
    public void display() {
        for(int i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public void dispLargestValue() {
        int max = a[0];
        for(int i = 0; i < 10; i++)
            if(a[i] > max) max = a[i];
        System.out.println("Max: " + max);
    }
    public void sort() {
        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 9 - i; j++)
                if(a[j] > a[j + 1]) {
                    a[j] ^= a[j + 1];
                    a[j + 1] ^= a[j];
                    a[j] ^= a[j + 1];
                }
    }
}

public class Lab5_ClassWithArray {
    public static void main(String args[]) {
        IntArray ia = new IntArray();
        ia.setArray();
        ia.dispLargestValue();
        System.out.println("Array: ");
        ia.display();
        ia.sort();
        System.out.println("Sorted array:");
        ia.display();
    }
}
