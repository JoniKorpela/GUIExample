package com.guiexample;

import java.awt.event.*;  
import javax.swing.JButton;

public class OpButton extends JButton implements ActionListener{

    CounterLabel label;

    OpButton(int x, int y, int width, int height, String text, CounterLabel label){
        super(text);
        setBounds(x, y, width, height);
        addActionListener(this);
        this.label = label;
    }

    public void actionPerformed(ActionEvent e){
        label.incrementLabel();
    }
}
