package com.sample;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import java.io.*;

public class AnswerPanel extends JPanel
{
    public AnswerPanel(String answer, String imageFileName)
    {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        ImagePanel image = new ImagePanel(imageFileName);
        image.setMinimumSize(new Dimension(620, 300));
        image.setPreferredSize(new Dimension(620, 300));
        gbc.weighty = 1.0;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbl.setConstraints(image, gbc);
        add(image);

        JLabel label = new JLabel(answer);
        label.setFont(new Font("Times New Roman", Font.BOLD, 24));
        gbc.weighty = 0.1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbl.setConstraints(label, gbc);
        add(label);
    }
}
