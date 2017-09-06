/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * To count number of objects created
 * @author Pranav Tharoor
 */

class RandomClass {
    static int num = 0;
    public RandomClass() {
        num++;
    }
}

public class Lab7_ObjectCounter {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char o;
        System.out.println("Create object? (y/n)");
        o = in.next().charAt(0);
        while(o == 'y') {
            System.out.println("Create object? (y/n)");
            new RandomClass();
            o = in.next().charAt(0);
        }
        System.out.println("Number of objects created: " + RandomClass.num);
    }
}
