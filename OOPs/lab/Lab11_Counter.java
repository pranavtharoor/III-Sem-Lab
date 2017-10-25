/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package lab;

/**
 * Counter
 * @author Pranav Tharoor
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class CounterGUI extends JFrame {
    
    JLabel count = new JLabel("0");
    JButton incrementButton = new JButton("+6");
    ListenForButton buttonClicked = new ListenForButton();
    JPanel mainPanel = new JPanel();

    public CounterGUI() {
        mainPanel.add(count);
        mainPanel.add(incrementButton);
        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        incrementButton.addActionListener(buttonClicked);
        this.setSize(100, 80);
        this.setVisible(true);
    }
    
    class ListenForButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == incrementButton)
                count.setText((Integer.parseInt(count.getText()) + 6) + "");
        }
    }
    
}


public class Lab11_Counter {
    public static void main(String args[]) {
        new CounterGUI();
    }
}
