package com.guiexample;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class CounterLabel extends JLabel {
    
    int count = 0;

    CounterLabel(Dimension dimension, String text) {
        super(text);
        setPreferredSize(new Dimension(100, 50));
    }

    public void incrementLabel(){
        count++;
        setText("Click count = " + count);
    }

    public int getCount(){
        return count;
    }
}
