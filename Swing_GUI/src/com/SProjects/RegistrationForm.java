package com.SProjects;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class RegistrationForm extends JFrame implements ActionListener {

    //Desing
    private Font f = new Font(Font.SERIF,Font.PLAIN,20);
    private Border blackline = BorderFactory.createLineBorder(Color.black);
    private JLabel Fname,Lname,Email,Phone;
    private String fname,lname,email,phone;
    private JTextField Ftf,Ltf,Etf,Ptf;
    private String reset = null;
    private JRadioButton r1,r2;
    private ButtonGroup btngrp = new ButtonGroup();
    private JButton Submit,Reset;
    private JTextArea TA;
    //Constructor
    public RegistrationForm() {

        //Text Area
        TA = new JTextArea();
        TA.setBounds(400,50,300,300);
        TA.setBorder(blackline);
        TA.setFont(new Font(Font.MONOSPACED,Font.BOLD,15));
        TA.setEditable(false);

        //Labels
        //Fname
        Fname = new JLabel("First Name  : ");
        Fname.setBounds(100,50,110,60);
        Fname.setFont(f);
        //Lname
        Lname = new JLabel("Last Name   : ");
        Lname.setBounds(100,100,110,60);
        Lname.setFont(f);
        //Email
        Email = new JLabel("Email          : ");
        Email.setBounds(100,150,110,60);
        Email.setFont(f);
        //Phone
        Phone = new JLabel("Phone          : ");
        Phone.setBounds(100,200,110,60);
        Phone.setFont(f);

        //Text Fields
        //Ftf
        Ftf = new JTextField("  ");
        Ftf.setBounds(230,65,120,35);
        Ftf.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        //Ltf
        Ltf = new JTextField("  ");
        Ltf.setBounds(230,115,120,35);
        Ltf.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        //Etf
        Etf = new JTextField("  ");
        Etf.setBounds(230,165,120,35);
        Etf.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
        //Ptf
        Ptf = new JTextField("  ");
        Ptf.setBounds(230,215,120,35);
        Ptf.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));

        //Radio Button
        //First Radio Button
        r1 = new JRadioButton("I Accept All T&C's.");
        r1.setBounds(100,280,150,15);
        r1.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));

        //Second Radio Button
        r2 = new JRadioButton("I Don't Accept T&C's.");
        r2.setBounds(100,310,180,15);
        r2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,15));
            //adding into groups
                btngrp.add(r1);
                btngrp.add(r2);

        //Button
        //Submit Button
        Submit = new JButton("Submit");
        Submit.setBounds(100,360,120,40);
        Submit.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()) {
                    if ((Ftf.getText().trim().length()) < 1  ){
                        JOptionPane.showMessageDialog(RegistrationForm.this,"First Name Is Mandatory...");
                    }
                    else {
//                        int phoneCount = Ptf.getText().trim().length();
                        if (Ptf.getText().trim().length() != 10) {
                            JOptionPane.showMessageDialog(RegistrationForm.this,"Enter A Valid Phone Number...");
                        }
                        else {
                            fname = Ftf.getText().trim();
                            lname = Ltf.getText().trim();
                            email = Etf.getText().trim();
                            phone = Ptf.getText().trim();
                            TA.setText("\n " + fname + " " + lname + "\n " + email + "\n " + phone + "\n\n Registration Completed...");
                        }
                    }
                }else {
                    JOptionPane.showMessageDialog(RegistrationForm.this, "Please Accept T&C's...");
                }
            }
        });
        //Reset Button
        Reset = new JButton("Reset");
        Reset.setBounds(230,360,120,40);
        Reset.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ftf.setText(reset);
                Ltf.setText(reset);
                Etf.setText(reset);
                Ptf.setText(reset);
                TA.setText(reset);
//                r1.setSelected(false);
//                r2.setSelected(false);
//                remove(r1);
////                add(r1);
//                remove(r2);
////                add(r2);
                // help from chat gpt
                btngrp.clearSelection();
            }
        });

        // Adding Components
        //Labels
        add(Fname);
        add(Lname);
        add(Email);
        add(Phone);
        //TextFields
        add(Ftf);
        add(Ltf);
        add(Etf);
        add(Ptf);
        //Radio
        add(r1);
        add(r2);
        //Button
        add(Submit);
        add(Reset);
        //Text Area
        add(TA);

        // JFrame
        setTitle("Registration Form");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

//    main method
    public static void main(String[] args) {
        new RegistrationForm();
    }
}
