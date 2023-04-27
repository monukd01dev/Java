package com.Components.Button;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myjframe extends JFrame {

    private ImageIcon backgroundImage = new ImageIcon("C:\\Users\\monuk\\IdeaProjects\\Java-master\\Java-master\\Resources_For_Projects\\Img\\theJava.jpg");


    protected void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgroundImage.getImage(), 0, 0, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
//        frame.setContentPane(new Myjframe());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
