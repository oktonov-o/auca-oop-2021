package GUI;

import processing.core.*;

import java.util.ArrayList;

public class Main extends PApplet {

    Game game = null;
    ArrayList<MyButton> cmdButtons = new ArrayList<>();
    ArrayList<MyButton> cellButtons = new ArrayList<>();

    private String mode = "beginner";
    private int row = 9;
    private int col = 9;
    private int mines = 10;
    private int dh;
    private int dw;
    private int step = 30;
    private int distanceW;
    private int distanceH;
    private int x0, y0;

    @Override
    public void settings() {
        fullScreen();
    }

    @Override
    public void setup() {
        dh = height/12;
        dw = width/7;

        game = createGame();

        //command buttons
        cmdButtons.add(new CommandButton( this,dw , 10*dh , dw, height/8,"Beginner", () -> {
            mode = "beginner";
            game = createGame();
        }));
        cmdButtons.add(new CommandButton( this,3*dw , 10*dh , dw, height/8, "Intermediate", () -> {
            mode = "intermediate";
            game = createGame();
        }));
        cmdButtons.add(new CommandButton( this,5*dw , 10*dh , dw, height/8,"Expert", ()->{
            mode = "expert";
            game = createGame();
        }));

    }

    private Game createGame() {
        initialize();
        cellButtons.clear();
        return new Game( row, col, mines);
    }

    private void initialize() {
        if (mode.equals("expert")){
            col = 30;
            row = 16;
            mines = 99;
        } else if (mode.equals("intermediate")){
            col = 16;
            row = 16;
            mines = 40;
        } else if (mode.equals("beginner")){
            col = 9;
            row = 9;
            mines = 10;
        }
    }

    @Override
    public void draw() {
        background(0);

        //cell buttons
        distanceW = col*step;
        distanceH = row*step;
        x0 = width/2-distanceW/2;
        y0 = 5*dh-distanceH/2;
        String txt;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (game.getData()[i][j]=='.'){
                    txt = "";
                } else if (game.getNumData()[i][j] == '*' && game.getData()[i][j] != 'F'){
                    txt = Character.toString(game.getNumData()[i][j]);
                } else {
                    txt = Character.toString(game.getData()[i][j]);
                };
                int finalJ1 = j;
                int finalI1 = i;
                cellButtons.add(new CellButton(this, x0+j*step, y0+i*step, step, step, txt, ()->{
                    if(mouseButton == LEFT){
                        game.left(finalI1, finalJ1);
                    } else if (mouseButton == RIGHT){
                        game.right(finalI1, finalJ1);
                    }
                }));
            }
        }
        if(game.lost){
            fill(255, 0, 0);
            circle(width/2, dh/2, dh);
        } else if (game.won){
            fill(0, 255, 0);
            circle(width/2, dh/2, dh);
        } else {
            fill(255, 255, 0);
            circle(width/2, dh/2, dh);
        }
        for (MyButton b:cmdButtons){
            b.draw();
        }
        for (MyButton b:cellButtons){
            b.draw();
        }

        // flags left
        fill(255, 0, 0);
        textSize(dh);
        textAlign(PApplet.LEFT, PApplet.UP);
        text(game.numOfFlagsLeft, 2*dw , dh);

        fill(255, 0, 0);
        textSize(dh);
        textAlign(PApplet.RIGHT, PApplet.UP);
        int time = (int) ((System.currentTimeMillis()-game.startTime)/1000);
        text(time%1000, 5*dw , dh);
    }

    @Override
    public void mouseReleased() {
        for (MyButton b:cmdButtons){
            if(b.contains(mouseX, mouseY)){
                b.performAction();
            }
        }
        for (MyButton b:cellButtons){
            if ((b.contains(mouseX, mouseY))) {
                b.performAction();
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("GUI.Main");
    }
}
