/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Computes areas of square and triangle using abstract 
 * @author Pranav Tharoor
 */

abstract class Shape3 {
    
    // Calculates area of shape
    abstract double computeArea(double... dimentions);
}

class Square extends Shape3 {

    // Returns area of square
    @Override
    double computeArea(double... dimentions) {
        return dimentions[0] * dimentions[0];
    }
    
}

class Triangle extends Shape3 {

    // Returns area of triangle
    @Override
    double computeArea(double... dimentions) {
        double s = dimentions[0] + dimentions[1] + dimentions[2];
        s /= 2;
        return Math.pow(s * (s - dimentions[0]) * (s - dimentions[1]) * (s - dimentions[2]), 0.5);
    }
    
}

public class Lab8_AbstractSquareTriangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Square c = new Square();
        System.out.println("Enter side of square: ");
        System.out.println("Area = " + c.computeArea(in.nextDouble()));
        Triangle r = new Triangle();
        System.out.println("Enter dimentions of triangle: ");
        System.out.println("Area = " + r.computeArea(in.nextDouble(), in.nextDouble(), in.nextDouble()));
    }
}

