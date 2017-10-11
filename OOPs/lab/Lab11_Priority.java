/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Sets priority of thread
 * @author Pranav Tharoor
 */

class ThreadRun2 implements Runnable {
    @Override
    public void run() {  
        System.out.println("Thread started\nPriority:" + Thread.currentThread().getPriority());  
        try{  
            Thread.sleep(1000);  // Waits 1 second
            System.out.println("Hello");  
        } catch (InterruptedException e){  
            System.out.println("Thread interrupted");  
        }
    }
}

public class Lab11_Priority {
    public static void main(String args[]) {
        Thread t1 = new Thread(new ThreadRun2());
        Thread t2 = new Thread(new ThreadRun2()); 
        t1.setPriority(Thread.MIN_PRIORITY);  // Sets priority
        t2.setPriority(Thread.MAX_PRIORITY);  
        t1.start();  
        t2.start();
        try {  
            t1.interrupt();  
        } catch(Exception e) {
            System.out.println(e);
        }  
    }
}
