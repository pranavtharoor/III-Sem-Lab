/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Validates a Matrix
 * @author Pranav Tharoor
 */

class MatrixNotSquareException extends Exception {
    public MatrixNotSquareException() {
        super();
    }
}

public class Lab10_MatrixValidation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimenitons of the matrix: ");
        int m = in.nextInt(), n = in.nextInt();
        try {
            checkMatrix(m, n);
        } catch(MatrixNotSquareException e) {
            System.out.println(e);
        }
    }
    public static void checkMatrix(int m, int n) throws MatrixNotSquareException {
        if(m != n) throw new MatrixNotSquareException(); // Throws exception if matrix is not a square
    }
}
