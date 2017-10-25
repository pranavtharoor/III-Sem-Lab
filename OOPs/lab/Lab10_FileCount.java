/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Count the number of vowels, words, lines, and characters in a file
 * @author Pranav Tharoor
 */
public class Lab10_FileCount {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        String path = "E:\\160911222";
        FileInputStream fi = new FileInputStream(path + "\\fileio.txt");
        int ch = 0, v = 0, l = 0, w = 0;
        int c;
        do {
            ch++;
            c = fi.read();
            char a = (char) c;
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') v++;
            else if(a == '\n') {
                l++;
                ch--;
            }
            else if(a == ' ') w++;
        } while(c != -1);
        l++;
        l++;
        w++;
        System.out.println("Words: " + w + "\nLines: " + l + "\nVowels: " + v + "\nCharacters: " + ch);
    }
}
