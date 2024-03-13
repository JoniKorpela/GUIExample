package com.guiexample;

import javax.swing.*;

public class UIFrame extends JFrame{
    UIFrame(){
        this.setTitle("GUIExample");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        setSize(400, 600);
    }
}
