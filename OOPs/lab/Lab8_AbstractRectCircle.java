/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Computes areas of rectangle and circle using abstract 
 * @author Pranav Tharoor
 */

abstract class Shape {
    
    // Calculates area of shape
    abstract double computeArea(double... dimentions);
}

class Circle extends Shape {

    // Returns area of circle
    @Override
    double computeArea(double... dimentions) {
        return dimentions[0] * dimentions[0] * 3.14159265358979323846;
    }
    
}

class Rectangle extends Shape {

    // Returns area of rectangle
    @Override
    double computeArea(double... dimentions) {
        return dimentions[0] * dimentions[1];
    }
    
}

public class Lab8_AbstractRectCircle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter radius of circle: ");
        System.out.println("Area = " + c.computeArea(in.nextDouble()));
        Rectangle r = new Rectangle();
        System.out.println("Enter dimentions of rectangle: ");
        System.out.println("Area = " + r.computeArea(in.nextDouble(), in.nextDouble()));
    }
}