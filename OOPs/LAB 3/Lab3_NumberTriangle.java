/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Prints Number Pattern
 * @author Pranav Tharoor
 */
public class Lab3_NumberTriangle {
    public static void main(String args[]) {
        for(int i = 1; i < 6; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
        int arr[][] = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4}, {5, 5, 5, 5, 5}};
        for(int i[]:arr) {
            for(int j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
