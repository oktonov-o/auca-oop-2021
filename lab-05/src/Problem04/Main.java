package Problem04;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

    JPanel mainPanel;
    JPanel controlPanel;

    JButton rButton = new JButton("Red");
    JButton gButton = new JButton("Green");
    JButton bButton = new JButton("Blue");

    Main () {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.red);
        add(mainPanel, BorderLayout.CENTER);

        controlPanel = new JPanel();
        controlPanel.setBackground(Color.darkGray);
        controlPanel.add(rButton);
        controlPanel.add(gButton);
        controlPanel.add(bButton);
        add(controlPanel, BorderLayout.SOUTH);

        rButton.addActionListener(e -> mainPanel.setBackground(Color.red));
        gButton.addActionListener(e -> mainPanel.setBackground(Color.green));
        bButton.addActionListener(e -> mainPanel.setBackground(Color.blue));
    }

    public static void main(String[] args) {

        Main frame = new Main();
        frame.setTitle("First GUI app");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}