package Problem02;

import java.awt.*;
import java.awt.event.*;
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

        rButton.addActionListener(new ButtonListener(this, Color.red));
        gButton.addActionListener(new ButtonListener(this, Color.green));
        bButton.addActionListener(new ButtonListener(this, Color.blue));
    }

    public static void main(String[] args) {

        Main frame = new Main();
        frame.setTitle("First GUI app");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ButtonListener implements ActionListener {
    Main frame;
    Color color;

    ButtonListener (Main frame, Color color){
        this.frame = frame;
        this.color = color;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.mainPanel.setBackground(color);
    }
}