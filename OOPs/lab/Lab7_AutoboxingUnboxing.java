/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Demonstrates autoboxinig and unboxing
 * @author Pranav Tharoor
 */
public class Lab7_AutoboxingUnboxing {
    public static void main(String args[]) {
        int i = 5, b = 3;
        Integer a = 1;
        i = a;
        a = b; // Autoboxing: Primitive b is converted to object a
        System.out.println("" + a + b + i);        
    }
}
