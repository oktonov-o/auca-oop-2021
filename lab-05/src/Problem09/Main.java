package Problem09;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Main extends JFrame {

    CanvasPanel mainPanel;
    GameModel game = new GameModel();

    Main () {
        mainPanel = new CanvasPanel();
        add(mainPanel, BorderLayout.CENTER);
        mainPanel.addKeyListener(new CanvasPanelListener());
    }

    public static void main(String[] args) {

        Main frame = new Main();
        frame.setTitle("Chessboard");
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class CanvasPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            //ChessBoard
            int widthCell = Math.round(getWidth() /8f);
            int heightCell = Math.round(getHeight() /8f);
            for(int row = 0; row<8; row++){
                for (int col = 0; col < 8; col++){
                    if(col%2==0 && row%2==0 || col%2!=0 && row%2!=0){
                        g.setColor(Color.BLACK);
                    } else  {
                        g.setColor(Color.WHITE);
                    }
                    g.fillRect(col*widthCell, row*heightCell, widthCell, heightCell);
                }
            }

            g.setColor(Color.RED);
            g.fillOval(game.getCol()*widthCell, game.getRow()*heightCell, widthCell, heightCell);
        }
    }

    class CanvasPanelListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_F1){
                JOptionPane.showMessageDialog( null, "hello");
            } else if (e.getKeyCode()==KeyEvent.VK_UP){
                game.moveUp();
            } else if (e.getKeyCode()==KeyEvent.VK_DOWN){
                game.moveDown();
            } else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                game.moveRight();
            } else if (e.getKeyCode()==KeyEvent.VK_LEFT){
                game.moveLeft();
            }
        }
    }
}