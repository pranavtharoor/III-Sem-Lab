/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Four-function calculator
 * @author Pranav Tharoor
 */
public class Lab2_Calculator {
    public static void main(String args[]) {
        char t;
        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            float a = in.nextFloat();
            System.out.print("Enter operator (+, -, *, /): ");
            char o = in.next().charAt(0);
            System.out.print("Enter second number: ");
            float b = in.nextFloat();
            System.out.print("Result: ");
            switch(o) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Invalid");
            }
            System.out.println("Do another(y/n)?");
            t = in.next().charAt(0);
        } while(t != 'n');
    }
}
