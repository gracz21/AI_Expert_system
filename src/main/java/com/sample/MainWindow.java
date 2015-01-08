package com.sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class MainWindow extends JFrame
{
    private static MainWindow instance;
    private QuestionPanel questionPanel;
    // private AnswerPanel answerPanel;
    

    public static MainWindow instance()
    {
        if (instance == null)
            instance = new MainWindow();
        return instance;
    }
    
    public MainWindow()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public boolean getBoolAnswer(String question, String[] options)
    {
        getContentPane().removeAll();
        getContentPane().repaint();
        questionPanel = new QuestionPanel(question, options);
        add(questionPanel);
        pack();
        getContentPane().repaint();
        return (questionPanel.getAnswer() != 0);
    }

    public int getIntAnswer(String question, String... options)
    {
        getContentPane().removeAll();
        getContentPane().repaint();
        questionPanel = new QuestionPanel(question, options);
        add(questionPanel);
        pack();
        getContentPane().repaint();
        return questionPanel.getAnswer();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                    MainWindow mw = MainWindow.instance();
                    JPanel panel = new JPanel();
                    JLabel waitLabel = new JLabel("waiting for rules to load...");
                    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                    panel.add(waitLabel);
                    mw.add(waitLabel);
                    mw.pack();
                    mw.setVisible(true);
                    mw.getContentPane().repaint();
                }
            });
    }
}
