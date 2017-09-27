/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * User defined exception class
 * @author Pranav Tharoor
 */
class UserDefinedException extends Exception {
    public UserDefinedException() {
        super();
    }
}

public class Lab10_UserDefinedException {
    public static void main(String args[]) {
        try {
            getCharAtIndex("qwe", 4);
        } catch(UserDefinedException e) {
            System.out.println(e);
        }
    }
    public static void getCharAtIndex(String s, int index) throws UserDefinedException {
        if(s.length() - 1 < index)
            throw new UserDefinedException(); // Throws exception if index is out of bounds
        else System.out.println(s.charAt(index));
    }
}