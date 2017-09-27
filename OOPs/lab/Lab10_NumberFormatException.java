/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Handles NumberFormatException
 * @author Pranav Tharoor
 */
public class Lab10_NumberFormatException {
    public static void main(String args[]) {
        try {
            System.out.println(Integer.parseInt("Hello")); // Cannot parse 'Hello' as an integer
        } catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
