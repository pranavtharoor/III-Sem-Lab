/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Sum of time
 * @author Pranav Tharoor
 */

class Time {
    int hours, mins, secs;
    
    // Initalizes value of the time object to 0
    Time() {
        hours = 0;
        mins = 0;
        secs = 0;
    }
    
    // Initializes time
    Time(int hours, int mins, int secs) {
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }
    
    // Displays time
    public void display() {
        System.out.print(hours + ":" + mins + ":" + secs);
    }
    
    // Returns a time which is the sum of input times
    public Time addTimes(Time t1, Time t2) {
        Time t = new Time();
        t.secs = (t1.secs + t2.secs) % 60;
        int temp = (t1.secs + t2.secs) / 60;
        t.mins = (t1.mins + t2.mins + temp) % 60;
        temp = (t1.mins + t2.mins + temp) / 60;
        t.hours = t1.hours + t2.hours + temp;
        return t;
    }
}

public class Lab5_TimeClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hours, mins and seconds of time 1");
        Time t1 = new Time(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println("Enter hours, mins and seconds of time 2");
        Time t2 = new Time(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println("Sum of times: ");
        t1.display();
        System.out.print(" + ");
        t2.display();
        System.out.print(" = ");
        Time t3 = t1.addTimes(t1, t2);
        t3.display();
    }   
}
