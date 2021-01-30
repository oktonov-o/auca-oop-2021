public class Canvas {
    public static final int SIZE = 20;

    private char[][] data;

    public Canvas(){
        data = new char[SIZE][SIZE];

        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++){
                data[row][col] = '.';
            }
        }
    }

    public void set(int row, int col) {
        if (row < 0 || row >= SIZE || col < 0 || col > SIZE){
            throw new RuntimeException("Canvas: coordinates out of canvas");
        }
        data[row][col] = '*';
    }

    public void show() {
        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++){
                System.out.print(data[row][col]);
            }
            System.out.println();
        }
    }
}
