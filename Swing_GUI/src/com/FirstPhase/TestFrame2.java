package com.FirstPhase;

import javax.swing.*;

public class TestFrame2 extends JFrame {

    TestFrame2() {
        JButton jb = new JButton("Oky...");
        jb.setBounds(150,150,60,20);
        add(jb);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestFrame2();
    }


}
