/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Hello world with swings
 * @author Pranav Tharoor
 */

import javax.swing.*;

class HelloWorldGUI extends JFrame {
    
    JLabel text = new JLabel("Hello World");
    
    public HelloWorldGUI() {
        this.add(text);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 80);
        this.setVisible(true);
    }
}

public class Lab11_HelloWorld {
    public static void main(String args[]) {
        new HelloWorldGUI();
    }
}
