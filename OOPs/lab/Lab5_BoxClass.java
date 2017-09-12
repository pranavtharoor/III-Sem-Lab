/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Calculates volume of a box
 * @author Pranav Tharoor
 */

class Box {
    double length, width, height;
    public void setDimentions(double length, double width, double height) { // initialize dimentions
        this.length = length; 
        this.width = width;
        this.height = height;
    }
    public double volume() { // returns volume
        return length * width * height; 
    }
}

public class Lab5_BoxClass {
    public static void main(String args[]) {
        Box b = new Box();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimentions of box");
        b.setDimentions(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Volume = " + b.volume());
    }
}