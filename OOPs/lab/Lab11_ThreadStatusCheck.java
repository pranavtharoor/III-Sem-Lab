/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Checking status of thread
 * @author Pranav Tharoor
 */

class ThreadRun1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started");
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread ended");    
    }
}

public class Lab11_ThreadStatusCheck {
    public static void main(String args[]) {
        Thread t1 = new Thread(new ThreadRun1());
        Thread t2 = new Thread(new ThreadRun1());
        t1.start();
        System.out.println(t1.isAlive());
        try {
            t1.join();
        } catch (InterruptedException e) {
              System.out.println(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
              System.out.println(e);
        }
    }
}
