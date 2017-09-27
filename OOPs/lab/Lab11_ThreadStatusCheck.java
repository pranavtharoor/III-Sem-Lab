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
    }
}

public class Lab11_ThreadStatusCheck {
    public static void main(String args[]) {
        Thread t = new Thread(new ThreadRun1());
        t.start();
        System.out.println(t.isAlive());
    }
}
