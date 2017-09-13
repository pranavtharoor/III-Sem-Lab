/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Calculates sum of complex numbers
 * @author Pranav Tharoor
 */

class Complex {
    int real, complex;
    
    // Returns real part
    public int getReal() {
        return real;
    }
    
    // Returns complex part
    public int getComplex() {
        return complex;
    }
    
    // Initializes complex numer
    public Complex(int real, int complex) {
        this.real = real;
        this.complex = complex;
    }
    
    // Adds two integer numbers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Adds one integer and one complex number
    public Complex add(int a, Complex b) {
        Complex com = new Complex(a + b.getReal(), b.getComplex());
        return com;
    }
    
    // Adds two complex numbers
    public Complex add(Complex a, Complex b) {
        Complex com = new Complex(a.getReal() + b.getReal(), a.getComplex() + b.getComplex());
        return com;
    }
}

public class Lab5_ComplexSum {
    public static void main(String args[]) {       
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        int a = 5;
        Complex c3 = c1.add(a, c1);
        Complex c4 = c1.add(c1, c2);        
        System.out.println(c1.getReal() + " + i(" + c1.getComplex() + ") + " + c2.getReal() + " + i(" + c2.getComplex() + ") = " + c4.getReal() + " + i(" + c4.getComplex() + ")");
        System.out.println(a + " + " + c1.getReal() + " + i(" + c1.getComplex() + ") = " + c3.getReal() + " + i(" + c3.getComplex() + ")");
    }   
}
