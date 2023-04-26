package com.SProjects;

import javax.swing.*;
import java.awt.*;

public class StaticForm1 extends JFrame {

    int Fheight = 350;
    int Fwidth = 400;

    StaticForm1() {
        //Components
            JLabel lb1 = new JLabel("Login Form"),
                    lb2 = new JLabel("User Name : "),
                    lb3 = new JLabel("Password   : ");
            JTextField tf1 = new JTextField();
            JTextField tf2 = new JTextField();
            JButton jb = new JButton("Log In");
            JOptionPane.showMessageDialog(this,"test message");
        //setting bounds
            // For heading
                lb1.setBounds(120, 30, 200, 40);
                lb1.setFont(new Font("Serif", Font.PLAIN, 30));
            // For input labels
                //first
                lb2.setBounds(60,100,150,30);
                lb2.setFont(new Font("Serif", Font.PLAIN, 25));
                //second
                lb3.setBounds(63, 150, 150, 30); // 50 = 30 height + 20 margin top
                lb3.setFont(new Font("Serif", Font.PLAIN, 25));

            // input fields
                tf1.setBounds(200,105,120,30);
                tf2.setBounds(200,155,120,30);

            // Login Button
                jb.setBounds(118, 220, 150, 40);
                jb.setFont(new Font("Serif", Font.PLAIN, 25));
        // Adding components
            add(lb1);
            add(lb2);
            add(lb3);
            add(tf1);
            add(tf2);
            add(jb);

        // Jframe code
            setTitle("KD's Form");
            setSize(Fwidth,Fheight);
            setLayout(null);
            setVisible(true);
    }

    public static void main(String[] args) {
        new StaticForm1();
    }
}
