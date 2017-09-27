/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Count number of characters, words, lines and vowels in a String
 * @author Pranav Tharoor
 */
public class Lab9_Count {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String str = in.nextLine();
        int characters = 0, words = 0, lines = 0, vowels = 0;
        for(int i = 0; i < str.length(); i++) {
            // Checks for words
            if(str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') words++;
            // Checks for lines
            if(str.charAt(i) == '.') lines++;
            //Checks for vowels
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') vowels++;
        }
        System.out.println("Characters: " + str.length() + "\nWords: " + ++words + "\nLines: " + lines + "\nVowels: " + vowels);
    }
}
