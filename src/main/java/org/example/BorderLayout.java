package org.example;
import javax.swing.*;
import java.awt.*;

public class BorderLayout extends JFrame {
    private CanvasComponent scene = new CanvasComponent();
    private JPanel panel;

    public BorderLayout() {
        this.panel = new JPanel();
        this.panel.setLayout(new java.awt.BorderLayout());
        this.add(this.panel);

        panel.add(this.scene, "Center");

        JLabel keyGuide = new JLabel();
        keyGuide.setText("Crystal Forgione");
        keyGuide.setFont(new Font("SansSerif", 0, 20));

        keyGuide.setHorizontalAlignment(2);

        final int FRAME_WIDTH = 1500;
        final int FRAME_HEIGHT = 1500;
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Cave Diver.Java II - Midterm Crystal Forgione");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JTextField textField = new JTextField();
        textField.setMaximumSize(new Dimension(100, 50));

        JLabel label = new JLabel("Enter the diver's depth rating:");
        JButton escapeBtn = new JButton("Escape");
        escapeBtn.addActionListener(e -> {
            Grid.userNum = Integer.parseInt(textField.getText());
            if (!Grid.diverPath(this.scene.getGraphics())) {
                JOptionPane.showMessageDialog(null, "No path was found.");
            }
        });

        JButton newCaveBtn = new JButton("New Cave");
        newCaveBtn.addActionListener(e -> {
            Grid.paint(this.scene.getGraphics());
        });



        JPanel southPanel = new JPanel();
        southPanel.setMaximumSize(new Dimension(300, 50));
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.LINE_AXIS));

        southPanel.add(label);
        southPanel.add(textField);
        southPanel.add(escapeBtn);
        southPanel.add(newCaveBtn);
        panel.add(southPanel, "South");


        Grid.paint(scene.getGraphics());

    }
}


