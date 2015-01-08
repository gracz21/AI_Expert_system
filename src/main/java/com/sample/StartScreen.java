package com.sample;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import java.io.*;

public class StartScreen extends JPanel
{
    private JButton button;

    public StartScreen()
    {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        JLabel label = new JLabel("Jakim piłkarzem jesteś?");
        label.setFont(new Font("Times New Roman", Font.BOLD, 24));
        gbc.weighty = 0.1;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbl.setConstraints(label, gbc);
        add(label);

        ImagePanel image = new ImagePanel("/home/jarasz/dev/java/put/si/drools/SI-system-ekspercki-/img/start_screen.jpg");
        image.setMinimumSize(new Dimension(465, 465));
        image.setPreferredSize(new Dimension(465, 465));
        gbc.weighty = 1.0;
        gbl.setConstraints(image, gbc);
        add(image);

        button = new JButton("Rozpocznij!");
        gbc.weighty = 0.1;
        gbl.setConstraints(button, gbc);
        add(button);

    }

    public JButton getButton()
    {
        return button;
    }
}

