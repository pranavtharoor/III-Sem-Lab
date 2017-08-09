/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Results of expressions
 * @author student
 */
public class Lab2_ExpressionExecute {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b");
        System.out.println("(a << 2) + (b >> 2) = " + ((in.nextInt() << 2) + (in.nextInt() >> 2)));
        System.out.println("Enter b");
        System.out.println("(b > 0) = " + (in.nextInt() > 0));
        System.out.println("Enter a and b");
        System.out.println("(a + b * 100) / 10 = " + ((in.nextInt() + in.nextInt() * 100) / 10));
        System.out.println("Enter a and b");
        System.out.println("a & b = " + (in.nextInt() & in.nextInt()));
    }
}
