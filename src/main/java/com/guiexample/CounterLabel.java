package com.guiexample;

import javax.swing.JLabel;

public class CounterLabel extends JLabel {
    
    int count = 0;

    CounterLabel(int x, int y, int width, int height, String text) {
        super(text);
        setBounds(x, y, width, height);
    }

    public void incrementLabel(){
        count++;
        setText("Click count = " + count);
    }
}
