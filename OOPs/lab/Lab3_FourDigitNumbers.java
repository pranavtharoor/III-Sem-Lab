/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Prints four digit numbers formed by 1, 2, 3, 4
 * @author Pranav Tharoor
 */
public class Lab3_FourDigitNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose case\nCase 1: Duplication of digits is allowed\nCase 2: Duplication of digits is not allowed\n");
        int c = in.nextInt();
        // Duplication is allowed
        if(c == 1) {
            for(int i = 1; i < 5; i++)
                for(int j = 1; j < 5; j++)
                    for(int k = 1; k < 5; k++)
                        for(int l = 1; l < 5; l++)
                            System.out.println(i + "" + j + "" + k + "" + l + "");
        } else if(c == 2) { // Duplication is not allowed
            for(int i = 1; i < 5; i++)
                for(int j = 1; j < 5; j++)
                    for(int k = 1; k < 5; k++)
                        for(int l = 1; l < 5; l++)
                            if(i != j && j != k && k != l && l != i && j != l && i != k)
                                System.out.println(i + "" + j + "" + k + "" + l + "");        
        } else {
            System.out.println("Invalid");
        }
    }  
}
