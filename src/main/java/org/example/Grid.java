package org.example;
import java.awt.*;
import java.util.Random;


public class Grid {

    public Grid() {
    }

    static int userNum;
    static int[][] array_2D = new int[10][10];

    public static void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        Random random = new Random();

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                Point point = new Point((x + 7) * Box.width, (y + 1) * Box.height);
                int depth = random.nextInt(1, 11);
                array_2D[y][x] = depth;
                Box box = new Box(point, depth);
                box.paint(g2);
            }
        }
    }

    public static boolean diverPath(Graphics g) {
        return diverPath(20, array_2D, 0, 0, (Graphics2D) g);
    }

    public static boolean diverPath(int breath, int[][] array_2D, int i, int j, Graphics2D g) {
        if (breath <= 0) {
            return false;
        }
        breath--;

        if (i >= array_2D.length || j >= array_2D.length) {
            return false;
        }

        int arrayNum = array_2D[i][j];
        if (arrayNum > userNum) {
            return false;
        }

        if (i == 9 && j == 9) {
            g.setColor(new Color(0xCDBD0B1A, true));
            g.fillRect((j + 7) * 60, (i + 1) * 60, 60, 60);
            return true;
        }
        /**
         * if the left side is true then there is no path, then the program looks at the right side.
         * if the right if is true then it returns false and there is no path.
         */

        if (!diverPath(breath, array_2D, i, j + 1, g) && !diverPath(breath, array_2D, i + 1, j, g)) {
            return false;

        }

        g.setColor(new Color(0xCDBD0B1A, true));
        g.fillRect((j + 7) * 60, (i + 1) * 60, 60, 60);

        return true;
    }
}


