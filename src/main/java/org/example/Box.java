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
    private Color color = new Color(0x12128E);
    private int lineWidth = 1;
    final static int height = 60;
    final static int width = 60;

    private int depth;

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
        g2.drawString(String.valueOf(depth), this.getP1().x + 15, this.getP1().y + 15);
        g2.setColor(this.getColor());
        g2.drawRect(this.getP1().x, this.getP1().y, width, height);
    }

}


