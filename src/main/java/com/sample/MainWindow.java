package com.sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class MainWindow extends JFrame implements ActionListener
{
    private static MainWindow instance;
    private QuestionPanel questionPanel;
    // private AnswerPanel answerPanel;
    

    public MainWindow()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static MainWindow instance()
    {
        if (instance == null)
            instance = new MainWindow();
        return instance;
    }
    
    public void showStartScreen()
    {
        setLayout(new BorderLayout());
        StartScreen startScreen = new StartScreen();
        add(startScreen, BorderLayout.CENTER);
        startScreen.getButton().addActionListener(this);
        pack();
    }
    
    public boolean getBoolAnswer(String question, String[] options)
    {
        getContentPane().removeAll();
        setLayout(new BorderLayout());
        questionPanel = new QuestionPanel(question, options);
        add(questionPanel, BorderLayout.CENTER);
        pack();
        return (questionPanel.getAnswer() != 0);
    }

    public int getIntAnswer(String question, String... options)
    {
        getContentPane().removeAll();
        setLayout(new BorderLayout());
        questionPanel = new QuestionPanel(question, options);
        add(questionPanel, BorderLayout.CENTER);
        pack();
        return questionPanel.getAnswer();
    }

    public void showAnswerPanel(String answer, String imageFileName)
    {
        getContentPane().removeAll();
        setLayout(new BorderLayout());
        AnswerPanel answerPanel = new AnswerPanel(answer, imageFileName);
        getContentPane().add(answerPanel, BorderLayout.CENTER);
        pack();
    }

    @Override
    public synchronized void actionPerformed(ActionEvent e)
    {
        notifyAll();
    }

    public static void main(String[] args)
    {
        MainWindow mw = MainWindow.instance();
        SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                    MainWindow mw = MainWindow.instance();
                    mw.showStartScreen();
                    mw.setVisible(true);
                }
            });
        synchronized (mw)
        {
            try { mw.wait(); }
            catch (InterruptedException e) { }
        }
        mw.getContentPane().removeAll();
        JLabel waitLabel = new JLabel("Poczekaj aż reguły się załadują...");
        mw.setLayout(new BorderLayout());
        mw.getContentPane().add(waitLabel, BorderLayout.CENTER);
        mw.pack();
    }
}
