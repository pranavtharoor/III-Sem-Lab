package lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Handles ArrayOverflowException
 * @author Pranav Tharoor
 */

class ArrayOverflowException extends Exception {
    public ArrayOverflowException() {
        super();
    }
}

public class Lab10_ArrayOverflowException {
    public static void main(String args[]) {
        try {
            getCharAtIndex("qwe", 4);
        } catch(ArrayOverflowException e) {
            System.out.println(e);
        }
    }
    public static void getCharAtIndex(String s, int index) throws ArrayOverflowException {
        if(s.length() - 1 < index)
            throw new ArrayOverflowException(); // Throws exception if index out of bounds
        else System.out.println(s.charAt(index));
    }
}
