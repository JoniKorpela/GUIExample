package com.guiexample;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

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

        // Start a new thread to listen to changes in the count
        Thread countListener = new Thread(() -> {
            while (true) {
                if (label.getCount() > 19) {
                    // Count is over 19, add a new button
                    SwingUtilities.invokeLater(() -> {
                        OpButton button2 = new OpButton(new Dimension(120, 50), "Now click me", label);
                        panel2.add(button2);
                        button.setEnabled(false);
                        frame.revalidate(); // Refresh the frame to reflect changes
                    });
                    break; // Exit the loop
                }
                try {
                    Thread.sleep(100); // Wait for a short interval before checking again
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        countListener.start(); // Start the count listening thread

        frame.setVisible(true); // Make the frame visible
    }
    
}