/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Swaps two variables
 * @author Pranav Tharoor
 */

class Num {
   int x;
}

public class Lab5_Swap {
    public static void main(String args[]) {
        Num a = new Num();
        Num b = new Num();
        a.x = 1;
        b.x = 2;
        System.out.println("a = " + a.x + "\tb = " + b.x);
        swapByReference(a, b);
        swapByValue(a.x, b.x);
    }
    
    // Swaps the values by passing in the actual values of the variables
    static void swapByValue(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Swapped using call by value:");
        System.out.println("a = " + a + "\tb = " + b);
    }
    
    // Swaps the values by passing in objects which reference the variables
    static void swapByReference(Num a, Num b) {
        a.x ^= b.x;
        b.x ^= a.x;
        a.x ^= b.x;
        System.out.println("Swapped using call by reference:");
        System.out.println("a = " + a.x + "\tb = " + b.x);
   }
}
