package com.guiexample;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class GUIExample {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new GUIExample();
    }

    public GUIExample(){

        JButton button = new JButton("Test Button");

        UIPanel panel = new UIPanel();
        UIFrame frame = new UIFrame();

    
        frame.add(panel, BorderLayout.CENTER);

        button.setBounds(50,100,95,30);  
        panel.add(button);
    }
    
}