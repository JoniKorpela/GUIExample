package com.guiexample;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

public class GUIExample{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new GUIExample();
    }

    public GUIExample(){

        
        UIPanel panel = new UIPanel();
        UIFrame frame = new UIFrame();
        CounterLabel label = new CounterLabel(30, 30, 30, 30, "Click count:");
        OpButton button = new OpButton(30, 30, 30, 30, "Click me", label);
        panel.add(button);
        panel.add(label);
    
        frame.add(panel, BorderLayout.CENTER);
    }
    
}