/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Replaces word to repeating characters
 * @author Pranav Tharoor
 */
public class Lab9_ReplaceWord {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word: ");
        String str = in.next ();
        System.out.println("Enter character to replace: ");
        char c = in.next().charAt(0);
        System.out.println("Enter string to replace with: ");
        String rep = in.next();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                String s = "" + c; // Converts char to string
                str = str.replace(s, rep); // Replaces substring
            }
        }
        System.out.println(str);
    }
}