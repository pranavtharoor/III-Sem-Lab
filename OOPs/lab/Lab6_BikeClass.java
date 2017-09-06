/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Demonstrates run time polymorphism
 * @author Pranav Tharoor
 */

class Bike {
    
    int speedlimit;
    
    public Bike() {
        speedlimit = 100;
    }
    
    public void run() {
        System.out.println("Speed limit: " + speedlimit);
    }
    
}

class Splendar extends Bike {

    int speedlimit;
    
    public Splendar() {
        speedlimit = 60;
    }
    
    @Override
    public void run() {
        System.out.println("Speed limit: " + speedlimit);
    }
    
}

public class Lab6_BikeClass {
    public static void main(String args[]) {
        Bike b = new Splendar();
        b.run();  
    }
}
