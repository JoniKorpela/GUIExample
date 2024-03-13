package com.guiexample;

import javax.swing.*;
import java.awt.*;


public class UIPanel extends JPanel{
    
    public UIPanel(){
        

        this.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));

        this.setPreferredSize(new Dimension(30, 30));
        this.setBackground(Color.white);
        this.setFocusable(true);


    }
}
