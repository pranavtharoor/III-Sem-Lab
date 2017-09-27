/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Creation of thread
 * @author Pranav Tharoor
 */

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread started by extending thread class");
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started by implementing runnable interface");
    }
}

public class Lab11_CreateThread {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter\n1 for creation of a htread using runnable interface\n"
                + "2 for creation of a thread using thread class");
        int o = in.nextInt();
        Thread1 t1;
        Thread t2;
        if(o == 1) { // Starts thread by extending thread class
            t1 = new Thread1();
            t1.start();
        } else if(o == 2) { // Starts thread by implementing runnable interface
            t2 = new Thread(new Thread2());
            t2.start();
        } else System.out.println("Invalid");
    }
}
