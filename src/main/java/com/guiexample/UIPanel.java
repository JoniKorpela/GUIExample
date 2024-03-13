package com.guiexample;

import javax.swing.*;
import java.awt.*;


public class UIPanel extends JPanel{
    
    public UIPanel(Dimension dimension, Color color){
        
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 30));
        this.setPreferredSize(dimension);
        this.setBackground(color);
        this.setFocusable(true);


    }
}
