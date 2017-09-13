/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Computes areas of rectangle and circle using interface 
 * @author Pranav Tharoor
 */

interface Shape2 {
    
    // Calculates area of shape
    double computeArea(double... dimentions);
}

class Circle2 implements Shape2 {

    // Returns area of circle
    @Override
    public double computeArea(double... dimentions) {
        return dimentions[0] * dimentions[0] * 3.14159265358979323846;
    }
    
}

class Rectangle2 implements Shape2 {

    // Returns area of rectangle
    @Override
    public double computeArea(double... dimentions) {
        return dimentions[0] * dimentions[1];
    }
    
}

public class Lab8_InterfaceRectCircle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Circle2 c = new Circle2();
        System.out.println("Enter radius of circle: ");
        System.out.println("Area = " + c.computeArea(in.nextDouble()));
        Rectangle2 r = new Rectangle2();
        System.out.println("Enter dimentions of rectangle: ");
        System.out.println("Area = " + r.computeArea(in.nextDouble(), in.nextDouble()));
    }
}
