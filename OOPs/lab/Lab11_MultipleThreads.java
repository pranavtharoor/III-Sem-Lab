/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Creates multiple threads
 * @author Pranav Tharoor
 */

class ThreadRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started");
    }
}

public class Lab11_MultipleThreads {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of threads");
        int n = in.nextInt();
        Thread[] threads = new Thread[n]; // Array of threads
        for(int i = 0; i < n; i++) {
            threads[i] = new Thread(new ThreadRun());
            threads[i].start(); // Starts the thread
        }
    }
}
