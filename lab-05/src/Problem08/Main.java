package Problem08;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

    CanvasPanel mainPanel;

    Main () {
        mainPanel = new CanvasPanel();
        add(mainPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {

        Main frame = new Main();
        frame.setTitle("Chessboard");
        frame.setSize(600,600);
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
        }
    }
}