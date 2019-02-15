package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame object = new JFrame();
        Gameplay gameplay = new Gameplay();
        object.setBounds(10,10,700,600);
        object.setTitle("Breakout Ball");
        object.setResizable(false);
        object.setVisible(true);
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.add(gameplay);
    }
}
