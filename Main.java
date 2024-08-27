package com.kaushik.breakoutgame;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Creating a JFrame object for the game window
        JFrame obj = new JFrame();
        
        // Creating an instance of the Gameplay class
        Gameplay gameplay = new Gameplay();
        
        // Setting up the JFrame (game window)
        obj.setTitle("Breakout Ball Game"); // Setting the game title
        obj.setSize(700, 600); // Setting the window size
        obj.setResizable(false); // Preventing the window from being resized
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closing operation
        
        // Adding the Gameplay instance to the JFrame
        obj.add(gameplay);
        
        // Making the window visible
        obj.setVisible(true);
    }
}
