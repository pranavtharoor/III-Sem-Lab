/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;
import java.util.Scanner;
/**
 * Checks if year is a leap year
 * @author Pranav Tharoor
 */
public class Lab2_LeapYear {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");                
        int year = in.nextInt();
        boolean leap;
        if(year % 4 != 0)
            leap = false;
        else if(year % 100 != 0)
            leap = true;
        else if(year % 400 != 0)
            leap = false;
        else
            leap = true;
        if(leap == true)
            System.out.println("Leap year");
        else
            System.out.println("Common year");                    
    }
}
