/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * To check for palindrome, write in alphabetical order, reverse and concatenate string
 * @author Pranav Tharoor
 */
public class Lab9_Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        String str = in.next();
        for(int i =- 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) { // Compares characters from either ends of the string
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Palindrome"); 
        else System.out.println("Not a palindrome");
    }
}
