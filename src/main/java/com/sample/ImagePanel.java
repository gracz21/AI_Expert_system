package com.sample;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;


public class ImagePanel extends JPanel
{
    private BufferedImage image;

    public ImagePanel(String filename)
    {
        try
        {
            image = ImageIO.read(new File(filename));
        }
        catch (IOException ex) { }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
    }

}
