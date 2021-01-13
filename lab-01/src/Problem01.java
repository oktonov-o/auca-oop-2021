public class Problem01 {
    static final int CANVAS_SIZE = 20;

    static final int NORTH = 0;
    static final int EAST = 1;
    static final int SOUTH = 2;
    static final int WEST = 3;

    static char[][] canvas = new char[CANVAS_SIZE][CANVAS_SIZE];
    static int turtleRow = 0;
    static int turtleCol = 0;
    static boolean turtleIsPenDown = true;
    static int turtleDir = EAST;

    public static void main(String[] args) {
        init();
        moveTurtles(10);
        printCanvas();
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

    static void moveTurtles(int nSteps){
        for (int i =0; i< nSteps; i++){
            if (turtleIsPenDown) {
                canvas[turtleRow][turtleCol] = '*';
            }
            turtleCol++;
        }
    }
}
