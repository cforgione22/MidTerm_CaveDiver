package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayout extends JFrame {
    private static final int FRAME_WIDTH = 2000;
    private static final int FRAME_HEIGHT = 2500;
    private Point bottom = new Point(100, 100);
    private CanvasComponent scene = new CanvasComponent();
    private JPanel panel;
    private JPanel panel2;
    public BorderLayout() {


        MouseAdapter listener = new MouseListener();
        this.scene.addMouseListener(listener);
        this.scene.addMouseMotionListener(listener);

        JLabel keyGuide = new JLabel();
        keyGuide.setText("Crystal Forgione");
        keyGuide.setFont(new Font("SansSerif", 0, 20));

        keyGuide.setHorizontalAlignment(2);
        this.panel = new JPanel();
        this.panel.setLayout(new java.awt.BorderLayout());
        this.panel.add(keyGuide, "North");
        this.add(this.panel);


//        this.panel.add(this.scene, "Center");
//        this.panel.add(label1, "East");
//        this.setTitle("Project-2: House");
//        this.setSize(3000, 2500);
//        this.setLocation(this.bottom);

       final int FRAME_WIDTH = 1500;
       final int FRAME_HEIGHT = 1500;
       setSize(FRAME_WIDTH,FRAME_HEIGHT);
       setTitle("Cave Diver.Java II - Midterm");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);


        this.panel2 = new JPanel();
        this.add(this.panel2);

        JLabel label1 = new JLabel("Tates a big boy");
        this.panel2.add(label1,BorderLayout.TOP_ALIGNMENT);

        JLabel label2 = new JLabel("Halloween");
        this.panel2.add(label2);

        TextField textField = new TextField();
        this.panel2.add(textField);

        JButton button1 = new JButton();
        this.panel2.add(button1);

        JButton button2 = new JButton();
        this.panel2.add(button2);

        panel.setLayout(new java.awt.BorderLayout());
        panel.add(this.scene, "Center");
}






    class MouseListener extends MouseAdapter {
        MouseListener() {
        }

        public void mousePressed(MouseEvent e) {
            Grid.paint(scene.getGraphics());
        }

        static class MyKeyListener extends KeyAdapter {

        }
    }
}



    /**
     *  border layout with a label at the top,
     *  JComponent in the middle,
     *  JPanel containing a label, a text field, and two buttons at the bottom.
     * The cave displayed in the middle of the form must be a 10 x 10 grid of cave cell objects.
     *
     * The cave cells in the examples are 50 x 50 pixels and must be displayed by using the
     * java.awt.Graphics methods. Each cave cell should store its row-column location
     */

