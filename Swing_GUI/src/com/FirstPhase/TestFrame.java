package com.FirstPhase;

import javax.swing.*;
// creating through aggregation
public class TestFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("KD's Frame"); //1. create object
        jf.setSize(400, 400); //2. Set the size of frame
        jf.setLayout(null); //3. Provide Layout if no put null
        jf.setVisible(true); // 4. Set the visibility of frame
    }
}
