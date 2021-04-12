package Console;

public class Game {
    int height;
    int width;
    int mines;
    int[][] data;


    public Game (int height, int width, int mines){
        if (height < 1){
            throw new RuntimeException("Game: height is less than one: " + height);
        }
        if (width < 1){
            throw new RuntimeException("Game: width is less than one: " + width);
        }
        if (mines < 1 || mines >= height*width){
            throw new RuntimeException("Game: incorrect number of mines: " + mines);
        }
        this.height = height;
        this.width = width;
        this.mines = mines;

        this.data = new int[height][width];
    }

    @Override
    public String toString() {
        String header = String.format("Mine Sweeper: height: %d, width = %d, mines = %d%n", height, width, mines);
        StringBuilder r = new StringBuilder(header);

        for (int i=0; i<height; i++){
            for (int j=0; j<width; j++){
                r.append(data[i][j]);
            }
            r.append("\n");
        }
        return r.toString();
    }

    public void left(int row, int col) {
        if (row < 0 || height <= row){
            throw new RuntimeException("Out of range");
        }
        if (col < 0 || width <= col){
            throw new RuntimeException("Out of range");
        }

        // if this is the first left click then put mines

        // do the rest
    }
}
