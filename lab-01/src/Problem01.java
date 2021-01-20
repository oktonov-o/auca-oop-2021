import java.util.Scanner;

public class Problem01 {
    static final int CANVAS_SIZE = 20;

    static final int NORTH = 0;
    static final int EAST = 1;
    static final int SOUTH = 2;
    static final int WEST = 3;

    static String penUpCommand = "penup";
    static String penDownCommand = "pendown";
    static String turnRightCommand = "turnright";
    static String turnLeftCommand = "turnleft";
    static String moveCommand = "move";
    static String printCommand = "print";
    static String exitCommand = "exit";

    static char[][] canvas = new char[CANVAS_SIZE][CANVAS_SIZE];
    static int turtleRow = 0;
    static int turtleCol = 0;
    static boolean turtleIsPenDown = false;
    static int turtleDir = EAST;
    static int steps = 0;

    public static void main(String[] args) {
        try{
            run();
        } catch (RuntimeException e){
            System.out.println("Your problem has a problem:");
            System.out.println("\t"+e.getMessage());
        }

    }

    private static void run() {
        Scanner inp = new Scanner(System.in);

        init();

        while (true){
            String s = inp.next().toLowerCase();
            if (s.equals(penUpCommand)){
                penUp();
            } else if (s.equals(penDownCommand)){
                penDown();
            } else if (s.equals(turnRightCommand)){
                turnRight();
            } else if (s.equals(turnLeftCommand)){
                turnLeft();
            } else if (s.equals(moveCommand)){
                steps = inp.nextInt();
                moveTurtle(steps-1);
                steps = 0;
            } else if (s.equals(printCommand)){
                printCanvas();
            } else if (s.equals(exitCommand)){
                break;
            } else {
                System.out.println("Incorrect command!");
            }
        }
    }

    private static void penUp() {
        turtleIsPenDown = false;
    }

    private static void penDown() {
        turtleIsPenDown = true;
        canvas[turtleRow][turtleCol] = '*';
    }

    private static void turnRight() {
        turtleDir++;
        if (turtleDir == 4){
            turtleDir = 0;
        }
    }

    private static void turnLeft() {
        turtleDir--;
        if (turtleDir == -1){
            turtleDir = 3;
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

        if (isOutOfCanvas(nSteps)) {
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
        } else {
            System.out.println("Incorrect number of moves!");
        }
    }
    
    private static boolean isOutOfCanvas(int nSteps){
        if (turtleDir == NORTH && turtleRow - nSteps < 0){
            return false;
        } else if (turtleDir == SOUTH && turtleRow + nSteps >= CANVAS_SIZE){
            return false;
        } else if (turtleDir == EAST && turtleCol + nSteps >= CANVAS_SIZE){
            return false;
        } else if (turtleDir == WEST && turtleCol - nSteps < 0){
            return false;
        } else {
            return true;
        }
    }
}
