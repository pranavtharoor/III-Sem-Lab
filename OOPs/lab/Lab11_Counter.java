/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 * Counter
 * @author Pranav Tharoor
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class CounterGUI {
    
    JLabel count = new JLabel("0");
    JButton incrementButton = new JButton("+6");
    ListenForButton buttonClicked = new ListenForButton();
    
    public CounterGUI() {
        incrementButton.addActionListener(buttonClicked);
        
    }
    
    class ListenForButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
}


public class Lab11_Counter {
    public static void main(String args[]) {
        new CounterGUI();
    }
}
