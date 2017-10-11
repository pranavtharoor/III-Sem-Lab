/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package lab;

import java.util.Scanner;

/**
 * To check for palindrome, write in alphabetical order, reverse and concatenate string
 * @author Pranav Tharoor
 */
public class Lab9_Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if(str.equals(rev)) System.out.println("Palindrome"); // Compares string with reversed string
        else System.out.println("Not a palindrome");
        System.out.println("Reversed string: " + rev);
        char[] arr = new char[100];
        arr = str.toCharArray();
        char temp;
        for(int i = 0; i < arr.length; i++) // Bubble sort
            for(int j = 0; j < arr.length - i - 1; j++)
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println("Sorted string: " + str.valueOf(arr));
    }
}
