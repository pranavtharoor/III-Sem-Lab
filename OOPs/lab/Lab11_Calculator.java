/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Calculator
 * @author Pranav Tharoor
 */


class Calculator extends JFrame {
    
    JTextField numOneInput = new JTextField();
    JTextField numTwoInput = new JTextField();
    JPanel mainPanel = new JPanel();
    JPanel inputPanel = new JPanel();
    JPanel operationsPanel = new JPanel();
    JPanel answerPanel = new JPanel();
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("x");
    JButton divideButton = new JButton("/");
    JLabel answerLabel = new JLabel();
    BoxLayout boxlayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);

    Color backgroundColor = new Color(22, 22, 22);
    Color textColor = new Color(250, 250, 250);
    Color inputFieldColor = new Color(100, 100, 100);
    
    ListenForButton buttonClicked = new ListenForButton();
    
    public Calculator() {
        this.setSize(300, 175);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        numOneInput.setPreferredSize(new Dimension(100, 20));
        numTwoInput.setPreferredSize(new Dimension(100, 20));
        numOneInput.setBackground(inputFieldColor);
        numTwoInput.setBackground(inputFieldColor);
        numOneInput.setForeground(textColor);
        numTwoInput.setForeground(textColor);
        
        answerLabel.setText("0");
        answerLabel.setForeground(textColor);
        
        mainPanel.setLayout(boxlayout);
        mainPanel.setBackground(backgroundColor);
        
        inputPanel.add(numOneInput);
        inputPanel.add(numTwoInput);
        inputPanel.setBackground(backgroundColor);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        
        addButton.addActionListener(buttonClicked);
        multiplyButton.addActionListener(buttonClicked);
        subtractButton.addActionListener(buttonClicked);
        divideButton.addActionListener(buttonClicked);  
        addButton.setBackground(textColor);
        subtractButton.setBackground(textColor);
        multiplyButton.setBackground(textColor);
        divideButton.setBackground(textColor);
        
        operationsPanel.add(addButton);
        operationsPanel.add(multiplyButton);
        operationsPanel.add(subtractButton);
        operationsPanel.add(divideButton);
        operationsPanel.setBackground(backgroundColor);
        
        answerPanel.add(answerLabel);
        answerPanel.setBackground(backgroundColor);
        
        mainPanel.add(inputPanel);
        mainPanel.add(operationsPanel);
        mainPanel.add(answerPanel);
        this.add(mainPanel);
        this.setVisible(true);
    }
    
    class ListenForButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = 0, num2 = 0;
            try {
                num1 = Double.parseDouble(numOneInput.getText());
                num2 = Double.parseDouble(numTwoInput.getText());
            } catch(NumberFormatException ex) {
                System.out.println(ex);
            }
            double answer = 0;
            
            if(e.getSource() == addButton) {
                answer = num1 + num2;
            } else if(e.getSource() == subtractButton) {
                answer = num1 - num2;
            } else if(e.getSource() == multiplyButton) {
                answer = num1 * num2;
            } else if(e.getSource() == divideButton) {
                answer = num1 / num2;
            }
            answerLabel.setText(answer + "");
        }

    }
    
}

public class Lab11_Calculator {
    public static void main(String args[]) {
        new Calculator();
    }
}

