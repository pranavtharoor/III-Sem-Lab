/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Computes areas of square and triangle using interface 
 * @author Pranav Tharoor
 */

interface Shape4 {
    
    // Calculates area of shape
    double computeArea(double... dimentions);
}

class Square2 implements Shape4 {

    // Returns area of square
    @Override
    public double computeArea(double... dimentions) {
        return dimentions[0] * dimentions[0];
    }
    
}

class Triangle2 implements Shape4 {

    // Returns area of triangle
    @Override
    public double computeArea(double... dimentions) {
        double s = dimentions[0] + dimentions[1] + dimentions[2];
        s /= 2;
        return Math.pow(s * (s - dimentions[0]) * (s - dimentions[1]) * (s - dimentions[2]), 0.5);
    }
    
}

public class Lab8_InterfaceSquareTriangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Square2 c = new Square2();
        System.out.println("Enter side of square: ");
        System.out.println("Area = " + c.computeArea(in.nextDouble()));
        Triangle2 r = new Triangle2();
        System.out.println("Enter dimentions of triangle: ");
        System.out.println("Area = " + r.computeArea(in.nextDouble(), in.nextDouble(), in.nextDouble()));
    }
}