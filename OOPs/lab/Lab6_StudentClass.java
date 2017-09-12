/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Tracks student details
 * @author Pranav Tharoor
 */

class Student {
	int regNo, age;
	String name;
	public Student(int regNo, int age, String name) {
		this.regNo = regNo;
		this.age = age;
		this.name = name;
	}
}

class UG extends Student {
	int semester, fees;
	public UG(int regNo, int age, String name, int semester) {
		super(regNo, age, name);
		this.semester = semester;
		this.fees = 3000;
	}
	public void display() {
		System.out.println("Reg no: " + regNo + "\nAge: " + age + "\nName: " + name + "\nSemester: " + semester + "\nFees: " + fees);
	}
}

class PG extends Student {
	int semester, fees;
	public PG(int regNo, int age, String name, int semester) {
		super(regNo, age, name);
		this.semester = semester;
		this.fees = 4000;
	}
	public void display() {
		System.out.println("Reg no: " + regNo + "\nAge: " + age + "\nName: " + name + "\nSemester: " + semester + "\nFees: " + fees);
	}
}

public class Lab6_StudentClass {
    public static void main(String args[]) {
    	PG pg = new PG(12, 23, "John Doe", 1);
    	UG ug = new UG(13, 21, "Jane Doe", 6);
    	pg.display();
    	ug.display();
    }
}
