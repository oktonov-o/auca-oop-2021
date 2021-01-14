import java.util.Scanner;

public class Problem01 {
    static final int CANVAS_SIZE = 20;

    static final int NORTH = 0;
    static final int EAST = 1;
    static final int SOUTH = 2;
    static final int WEST = 3;

    static String penUpCommand = "PenUp";
    static String penDownCommand = "PenDown";
    static String turnRightCommand = "TurnRight";
    static String turnLeftCommand = "TurnLeft";
    static String moveCommand = "Move";
    static String printCommand = "Print";
    static String exitCommand = "Exit";

    static char[][] canvas = new char[CANVAS_SIZE][CANVAS_SIZE];
    static int turtleRow = 0;
    static int turtleCol = 0;
    static boolean turtleIsPenDown = false;
    static int turtleDir = EAST;
    static int steps = 0;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        init();

        while (true){
            String s = inp.next();
            if (s.equals(penUpCommand)){
                turtleIsPenDown = false;
            } else if (s.equals(penDownCommand)){
                turtleIsPenDown = true;
                canvas[turtleRow][turtleCol] = '*';
            } else if (s.equals(turnRightCommand)){
                turtleDir++;
                if (turtleDir == 4){
                    turtleDir = 0;
                }
            } else if (s.equals(turnLeftCommand)){
                turtleDir--;
                if (turtleDir == -1){
                    turtleDir = 3;
                }
            } else if (s.equals(moveCommand)){
                steps = inp.nextInt();
                moveTurtle(steps-1);
                steps = 0;
            } else if (s.equals(printCommand)){
                printCanvas();
            } else if (s.equals(exitCommand)){
                break;
            }
        }
    }

    static void init() {
        for (int row = 0; row < CANVAS_SIZE; row++){
            for (int col = 0; col < CANVAS_SIZE; col++){
                canvas[row][col] = '.';
            }
        }
    }

    static void printCanvas() {
        for (int row = 0; row < CANVAS_SIZE; row++){
            for (int col = 0; col < CANVAS_SIZE; col++){
                System.out.print(canvas[row][col]);
            }
            System.out.println();
        }
    }

    static void moveTurtle(int nSteps){

        if (turtleDir == NORTH && turtleRow - nSteps < 0){
            System.out.println("Incorrect number of moves!");
        } else if (turtleDir == SOUTH && turtleRow + nSteps >= CANVAS_SIZE){
            System.out.println("Incorrect number of moves!");
        } else if (turtleDir == EAST && turtleCol + nSteps >= CANVAS_SIZE){
            System.out.println("Incorrect number of moves!");
        } else if (turtleDir == WEST && turtleCol - nSteps < 0){
            System.out.println("Incorrect number of moves!");
        } else {
            for (int i = 0; i < nSteps; i++){
                if (turtleDir == NORTH){
                    turtleRow--;
                } else if (turtleDir == SOUTH){
                    turtleRow++;
                } else if (turtleDir == EAST){
                    turtleCol++;
                } else if (turtleDir == WEST){
                    turtleCol--;
                }
                if (turtleIsPenDown) {
                    canvas[turtleRow][turtleCol] = '*';
                }
            }
        }
    }
}
