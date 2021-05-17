package Console;

import java.util.ArrayList;
import java.util.Random;

public class Game {


    private static final int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static final int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};

    private boolean firstTime = true;
    private int height;
    private int width;
    private int numOfMines;
    private int numOfFlagsLeft;
    private char[][] data;
    private char[][] numData;
    private ArrayList<Flag> flags = new ArrayList<>();
    private boolean[][] revealed;
    public boolean lost = false;
    public boolean won = false;
    private int nCorrectFlags;


    public Game (int height, int width, int numOfMines){
        if (height < 1){
            throw new RuntimeException("Game: height is less than one: " + height);
        }
        if (width < 1){
            throw new RuntimeException("Game: width is less than one: " + width);
        }
        if (numOfMines < 1 || numOfMines >= height*width){
            throw new RuntimeException("Game: incorrect number of mines: " + numOfMines);
        }
        this.height = height;
        this.width = width;
        this.numOfMines = numOfMines;
        numOfFlagsLeft = numOfMines;
        nCorrectFlags = numOfMines;

        data = new char[height][width];
        numData = new char[height][width];
        revealed = new boolean[height][width];
        for (int i=0; i<height; i++){
            for (int j=0; j<width; j++){
                data[i][j] = '.';
            }
        }
    }

    @Override
    public String toString() {
        String header = String.format("Mine Sweeper: height: %d, width = %d, mines = %d%n", height, width, numOfMines);
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

        if (firstTime){
            init(row, col);
            firstTime = false;
        }
        if (numData[row][col] == '*'){
            lost = true;
        } else {
            if (flags.contains(new Flag(row, col))){
                flags.remove(new Flag(row, col));
                data[row][col] = '.';
                ++numOfFlagsLeft;
            }
            reveal(row, col);
        }
    }

    private void reveal(int row, int col) {
        if (0 > row || row >= height || col < 0 || col >= width) return;
        if(revealed[row][col]) return;
        revealed[row][col] = true;
        if(numData[row][col] != '0'){
            data[row][col] = numData[row][col];
            return;
        } else {
            data[row][col] = '0';
        }
        for (int i=0; i<dr.length; i++){
            reveal(row + dr[i], col + dc[i]);
        }
    }

    private void init(int r, int c){
        Random random = new Random();
        int tr, tc;
        int m = 0;
        while (m < numOfMines){
            tr = random.nextInt(height);
            tc = random.nextInt(width);
            if (tr != r && tc != c && numData[tr][tc] != '*'){
                numData[tr][tc] = '*';
                m++;
            }
        }
        if (firstTime){
            initNumData();
        }
    }

    private void initNumData() {
        for (int r=0; r<height; r++){
            for (int c=0; c<width; c++){
                if (numData[r][c] != '*'){
                    int nMines=0;
                    for (int i=0; i<dr.length; i++){
                        int tr = r+dr[i];
                        int tc = c + dc[i];
                        if (0 <= tr && tr < height && tc >= 0 && tc < width && numData[tr][tc] == '*'){
                            ++nMines;
                        }
                    }
                    numData[r][c] = (char)(48+nMines);
                }
            }
        }
    }

    public void right(int row, int col) {
        if (row < 0 || height <= row){
            throw new RuntimeException("Out of range");
        }
        if (col < 0 || width <= col){
            throw new RuntimeException("Out of range");
        }
        if (numOfFlagsLeft == 0){
            throw new RuntimeException("No Flags Left");
        }
        Flag flag = new Flag(row, col);
        if (flags.contains(flag)){
            flags.remove(flag);
            data[row][col] = '.';
            ++numOfFlagsLeft;
            if (numData[row][col] == '*'){
                ++nCorrectFlags;
            }
        } else {
            flags.add(flag);
            --numOfFlagsLeft;
            data[row][col] = 'F';
            if (numData[row][col] == '*'){
                --nCorrectFlags;
            }
        }
        if (nCorrectFlags == 0 && numOfFlagsLeft == 0){
            won = true;
        }
    }

    public void show() {
        for (int r=0; r < height; r++){
            for (int c=0; c< width; c++){
                System.out.print(numData[r][c]);
            }
            System.out.println();
        }
    }
}
