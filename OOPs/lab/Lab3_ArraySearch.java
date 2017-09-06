/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Searches for number in an array
 * @author Pranav Tharoor
 */
public class Lab3_ArraySearch {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 1, 2, 1, 5, 6, 7};
        int searchValue = 1, j = 0;
        System.out.print("The value is found at locations:");
        for(int i: a) { // Iterates through array and checks if element is searchValue
            if(i == searchValue)
                System.out.print(" a[" + j + "]");
            j++;
        }
    }
}