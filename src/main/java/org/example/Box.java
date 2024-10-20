package org.example;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.*;

/**
 * class Box has final static height
 * and final static width as data fields
 * because the height and width of the boxes
 * in the grid don't change, and it's not for a
 * specific box.
 */

public class Box {

    private Point point1;
    private Color color = new Color(0xFFFFFF);
    private int lineWidth = 1;
    final static int height = 60;
    final static int width = 60;
    private int depth;
    //private Color depthColor = new Color(0xFFFFFF);

    public Box() {
        point1 = new Point(0, 0);
        color = Color.BLUE;
    }

    public Box(Point point1, int depth) {
        setP1(point1);
        this.depth = depth;
    }

    public void setP1(Point p1) {
        this.point1 = p1;
    }


    public Point getP1() {
        return point1;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke((float) this.getLineWidth()));
        depthColor(g2);
        g2.setColor(getColor());
        g2.fillRect(this.getP1().x, this.getP1().y, width, height);
        g2.setColor(Color.white);
        g2.drawString(String.valueOf(depth), this.getP1().x + 15, this.getP1().y + 15);
    }


    public void depthColor(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        switch (depth) {
            case 1:
                color = new Color(0x2736A5);
                break;
            case 2:
                color = new Color(0x1E2D9E);
                break;
            case 3:
                color = new Color(0x17258E);
                break;
            case 4:
                color = new Color(0x0F1B91);
                break;
            case 5:
                color = new Color(0x0A1677);
                break;
            case 6:
                color = new Color(0x0B1760);
                break;
            case 7:
                color = new Color(0x05123E);
                break;
            case 8:
                color = new Color(0x040B39);
                break;
            case 9:
                color = new Color(0x01091E);
                break;
            case 10:
                color = new Color(0x000000);
                break;
        }
    }
}


