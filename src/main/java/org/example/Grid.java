package org.example;

import java.awt.*;

public class Grid {

    public Grid() {
    }

    public static void paint(Graphics g) {
        for (int y = 1; y < 11; y++) {
            for (int x = 7; x < 17; x++) {
                Point point = new Point(x * Box.width, y * Box.height);
                Color color = new Color(0x12128E);

                Box box = new Box(point, color);
                box.paint(g);
            }
        }
    }

}
