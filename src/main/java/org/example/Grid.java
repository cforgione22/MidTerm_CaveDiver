package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Grid {

    public Grid() {
    }

    public static void paint(Graphics g) {

        int[][] array_2D = new int[10][10];
        Random random = new Random();

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                Point point = new Point((x + 7) * Box.width, (y + 1) * Box.height);
                int depth = random.nextInt(1, 11);
                array_2D[y][x] = depth;
                Box box = new Box(point, depth);
                box.paint(g);
            }
        }
    }
}
