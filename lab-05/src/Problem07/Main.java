package Problem07;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

public class Main extends JFrame {

    JPanel mainPanel;

    Main () {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.DARK_GRAY);
        add(mainPanel, BorderLayout.CENTER);

        mainPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {

                setTitle(e.getX() + ", " + e.getY());
            }
        });
    }

    public static void main(String[] args) {

        Main frame = new Main();
        frame.setTitle("Move mouse");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}