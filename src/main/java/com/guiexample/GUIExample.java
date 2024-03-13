package com.guiexample;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
public class GUIExample{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new GUIExample();
    }

    public GUIExample(){
        
        UIPanel panel = new UIPanel(new Dimension(200, 200), Color.white);
        UIPanel panel2 = new UIPanel(new Dimension(200, 200), Color.GRAY);
        UIFrame frame = new UIFrame();
        CounterLabel label = new CounterLabel(new Dimension(100, 50), "Click count: 0");
        OpButton button = new OpButton(new Dimension(100, 50), "Click me", label);
        panel2.add(button);
        panel.add(label);

        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);
    }
    
}