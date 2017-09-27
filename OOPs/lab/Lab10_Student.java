/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Calculates percentage from marks
 * @author Pranav Tharoor
 */
public class Lab10_Student {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter students name, roll no. and marks in three subjects: ");
        String name = in.next();
        String rollno = in.next();
        int marks = 0;
        try {
            for(int i = 0; i < 3; i++)
                marks += Integer.parseInt(in.next()); // Throws NumberFormatException if string cannot be parsed
        } catch(NumberFormatException e) {
            System.out.println(e);
        }
        marks /= 3;
        System.out.println("Percentage = " + marks);
        if(marks > 90) System.out.println("Grade: A");
        else if(marks > 70) System.out.println("Grade: B");
        else if(marks > 50) System.out.println("Grade: C");
        else System.out.println("Grade: D");

    }
}
