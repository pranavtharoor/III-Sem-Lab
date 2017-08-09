/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author student
 */
public class Lab3_AdditionalNumberTriangle {
    public static void main(String args[]) {
        for(int i = 1, k = 1; i < 5; i++) {
            for(int j = 0; j < i; j++, k++)
                System.out.print(k + " ");
            System.out.println();
        }
    }
}
