package com.Components.Button;

import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;


public class ButtonWithAction extends JFrame implements ActionListener {

    JTextField jtf;
    JButton jb,jb1;
    ButtonWithAction() {
        jtf = new JTextField();
        jtf.setBounds(118, 100, 150, 40);
        jb = new JButton("Click");
        jb.setBounds(118, 200, 150, 40);
        jb1 = new JButton("Reset");
        jb1.setBounds(118, 300, 150, 40);

        // Adding Actions
        jb.addActionListener(this);
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtf.setText(null);
            }
        });

        // Adding Components
        add(jtf);
        add(jb);
        add(jb1);


        // JFrame 
        setSize(400, 400);
//        isResizable(false);
        setLayout(null); 
        setVisible(true);
    }

    // overriding the abstract method
    public void actionPerformed(ActionEvent event) {
        jtf.setText("KD's Frame");
    }




    public static void main(String[] args) {
        new ButtonWithAction();
    }
}
