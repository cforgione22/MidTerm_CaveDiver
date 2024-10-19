package org.example;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;





/**
 *  The example uses a border layout with a label at the top, a JComponent in
 * the middle, and a JPanel containing a label, a text field, and two buttons at the bottom.
 * The cave displayed in the middle of the form must be a 10 x 10 grid of cave cell objects. The
 * cave cells in the examples are 50 x 50 pixels and must be displayed by using the
 * java.awt.Graphics methods. Each cave cell should store its row-column location
 *
 * depth, and if it is part of an escape route. Use a random number generator to determine the
 * depths. Note that the color of the rectangle for each cave cell is a shade of blue that is based
 * on the depth of the cave cell; shallow cells are light blue and deeper cells are dark blue.
 * The diver starts in the upper-left corner and must find a route that exits the cave in the low
 */

public abstract class Main {
    public static void main(String[] args) {
        JFrame frame = new BorderLayout();
        ((JFrame) frame).setDefaultCloseOperation(3);
        ((JFrame) frame).setVisible(true);


    }

}
