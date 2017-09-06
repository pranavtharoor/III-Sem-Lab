/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Computes Series values
 * @author Pranav Tharoor
 */
public class Lab3_Series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = in.nextDouble();
        x *= 3.1415 / 180;
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();
        double s = 0;
        // Calculates sin of x
        for(int i = 0; i < n; i++)
            s += Math.pow(-1, i) * Math.pow(x, (2 * i) + 1) / fact((2 * i) + 1);
        System.out.println("Sin(" + x + ") = " + s);
        s = 0;
        for(int  i = 1; i <= n; i++)
            s += Math.pow(1.0 / i, i); 
        System.out.print("Sum = " + s);

    }
    
    static double fact(int i) {
        if(i == 0) return 1;
        return i * fact(i - 1);
    }
    
}
