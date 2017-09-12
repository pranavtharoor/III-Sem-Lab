/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package lab;

import java.util.Scanner;

/**
 * Creates a list of books
 * @author Pranav Tharoor
 */

class Book {
    String title, author;
    int edition;
    public void setData(String title, String author, int edition) { 
        this.title = title;
        this.author = author;
        this.edition = edition;
    }
    public void findByAuthorAndDisplay(String author, Book[] b) {
        for(int i = 0; i < b.length; i++) {
            if(b[i].author.equals(author)) {
                System.out.println();
                System.out.println("Title: " + b[i].title);
                System.out.println("Author: " + b[i].author);                
                System.out.println("Edition: " + b[i].edition);                                
            }
        }
    }
}

public class Lab5_BookClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of books: ");
        int n = in.nextInt();
        Book a = new Book();
        Book[] b = new Book[n];
        for(int i = 0; i < n; i++) {
            b[i] = new Book();
            System.out.println("\nBook " + (i + 1));
            System.out.print("Titile: ");
            String title = in.next();
            System.out.print("Author: ");
            String author = in.next();
            System.out.print("Edition: ");
            int edition = in.nextInt(); 
            b[i].setData(title, author, edition);
        }
        a.findByAuthorAndDisplay("Harry", b);
    }
}
