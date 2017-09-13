/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Computes total sales of hardware and software
 * @author Pranav Tharoor
 */

interface Company {
    
}

class Hardware implements Company {
    String category, manufacturer;
    double sales;
    
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
    public double getSales() {
        return sales;
    }
}

class Software implements Company {
    String type, os;
    double sales;
    
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
    public double getSales() {
        return sales;
    }
}

public class Lab8_CompanyInterface {
    public static void main(String args[]) {
        
    }
}
