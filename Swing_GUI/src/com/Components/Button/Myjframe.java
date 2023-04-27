package com.Components.Button;

import javax.swing.*;

public class Myjframe extends JFrame {

    private ImageIcon backgroundImage = new ImageIcon("D:\\Users\\JavaplusDSA\\Java\\Resources_For_Projects\\Img\\theJava.jpg");
    private JLabel lb;
    public Myjframe() {
        lb = new JLabel("", backgroundImage, JLabel.CENTER);
        lb.setBounds(0,0,800,600);
        add(lb);

        setTitle("Image Test");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Myjframe();
    }

}
