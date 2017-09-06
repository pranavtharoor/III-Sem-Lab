/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Stores student details
 * @author Pranav Tharoor
 */

class Student_Detail {
    int id;
    String name, college_name;
    public Student_Detail(int id, String name) {
        college_name = "MIT";
        this.id = id;
        this.name = name;
    }
    public void display_details() {
        System.out.println("Name: " + name + "\nID: " + id + "\nCollege Name: " + college_name);
    }
}

public class Lab7_StudentDetail {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student id and name: ");
        Student_Detail sd = new Student_Detail(in.nextInt(), in.nextLine());
        System.out.println("\nStudent details: ");        
        sd.display_details();
    }
}
