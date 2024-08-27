package com.kaushik.breakoutgame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int[][] map;
    public int brickWidth;
    public int brickHeight;

    // Constructor to define the layout of bricks
    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[i][j] = 1; // 1 indicates that the brick is not broken
            }
        }
        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }

    // Method to draw the bricks
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    // Draw the brick with a specific color
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    // Draw the brick borders
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    // Method to set the value of a brick (used to remove it)
    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }
}
