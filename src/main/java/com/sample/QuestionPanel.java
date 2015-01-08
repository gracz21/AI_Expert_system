package com.sample;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class QuestionPanel extends JPanel implements ActionListener
{
    private int answer;
    private ButtonGroup buttonGroup;
    private java.util.List<JRadioButton> buttons;
    private JButton confirmButton;
    
    public QuestionPanel(String question, String[] options)
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel(question));
        buttons = new ArrayList<JRadioButton>();
        buttonGroup = new ButtonGroup();
        for (int i = 0; i < options.length; i++)
        {
            JRadioButton optionButton = new JRadioButton(options[i]);
            optionButton.setAlignmentX(Component.LEFT_ALIGNMENT);
            optionButton.addActionListener(this);
            buttons.add(optionButton);
            buttonGroup.add(optionButton);
            add(optionButton);
        }
        confirmButton = new JButton("Next");
        confirmButton.addActionListener(this);
        confirmButton.setEnabled(false);
        add(confirmButton);
    }

    @Override
    public synchronized void actionPerformed(ActionEvent e)
    {
        // System.out.printf("actionPerformed - %d\n", Thread.currentThread().getId());
        if (e.getSource() instanceof JRadioButton)
            confirmButton.setEnabled(true);
        else
        {
            for (int i = 0; i < buttons.size(); i++)
                if (buttons.get(i).isSelected())
                    answer = i;
            notifyAll();
        }
    }

    public synchronized int getAnswer()
    {
        try { wait(); }
        catch (InterruptedException e) { }
        return answer;
    }
}
