/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package lab;

/**
 * Computes total sales of hardware and software
 * @author Pranav Tharoor
 */

import java.util.Scanner;

interface Company {
    double getSales();
}

class Hardware implements Company {
    String category, manufacturer;
    double sales;
    
    public Hardware() {}

    // Initializes Hardware and sets sales to zero
    public Hardware(String category, String manufacturer) {
        sales = 0;
        this.category = category;
        this.manufacturer = manufacturer;
    }
    
    // Increments value of sales
    public void incSales(double sale) {
        sales += sale;
    }
    
    // Returns total sales
    @Override
    public double getSales() {
        return sales;
    }
}

class Software implements Company {
    String type, os;
    double sales;
    
    public Software(){}

    // Initializes Software and sets sales to zero
    public Software(String type, String os) {
        sales = 0;
        this.type = type;
        this.os = os;
    }
    
    // Increments value of sales
    public void incSales(double sale) {
        sales += sale;
    }
    
    // Returns total sales
    @Override
    public double getSales() {
        return sales;
    }
}

public class Lab8_CompanyInterface {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        Hardware h = new Hardware();
        Software s = new Software();
        while(a != 3) {
            System.out.println("Enter\n1: Hardware\n2: Software\n3: Quit");
            a = in.nextInt();
            if(a == 1) {
                System.out.println("Enter category:");
                String category = in.next();
                System.out.println("Enter manufacturer:");
                String manufacturer = in.next();
                h = new Hardware(category, manufacturer);
                System.out.println("Increase sales by: ");
                h.incSales(in.nextDouble());
            } else if(a == 2) {
                System.out.println("Enter type:");
                String type = in.next();
                System.out.println("Enter os:");
                String os = in.next();
                s = new Software(type, os);
                System.out.println("Increase sales by: ");
                h.incSales(in.nextDouble());
            } else if(a != 3) System.out.println("Invalid");
        }
        System.out.println("Total sales: " + (h.getSales() + s.getSales()));
    }
}
