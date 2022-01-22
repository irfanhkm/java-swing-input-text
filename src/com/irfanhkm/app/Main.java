package com.irfanhkm.app;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        JFrame frame = new JFrame("App");
        frame.setContentPane(app.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
