package com.guiexample;

import java.awt.Dimension;
import java.awt.event.*;  
import javax.swing.JButton;

public class OpButton extends JButton implements ActionListener{

    CounterLabel label;

    OpButton(Dimension dimension, String text, CounterLabel label){
        super(text);
        this.setPreferredSize(dimension);
        addActionListener(this);
        this.label = label;
    }

    public void actionPerformed(ActionEvent e){
        label.incrementLabel();
    }
}
