import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        final int SIZE = 9;
        boolean yes;

        for (int inc=1; inc <= n; inc++){
            yes = true;
            int[][] sudoku = new int[SIZE][SIZE];
            for (int row=0; row<SIZE; row++){
                for (int col=0; col<SIZE; col++){
                    sudoku[row][col] = inp.nextInt();
                }
            }
            for(int row=0; row<SIZE; row++){
                HashSet<Integer> set1 = new HashSet<>();
                for(int col=0; col<SIZE; col++){
                    set1.add(sudoku[row][col]);
                }
                if (set1.size() != 9) {
                    yes = false;
                    break;
                }
            }

            for(int col=0; col<SIZE; col++){
                HashSet<Integer> set2 = new HashSet<>();
                for(int row=0; row<SIZE; row++){
                    set2.add(sudoku[row][col]);
                }
                if (set2.size() != SIZE) {
                    yes = false;
                    break;
                }
            }
            for (int i=0; i<7; i+=3){
                for (int j=0; j<7; j+=3){
                    HashSet<Integer> set3 = new HashSet<>();
                    for(int row=0; row<3; row++){
                        for (int col=0; col<3; col++){
                            set3.add(sudoku[i+row][j+col]);
                        }
                    }
                    if (set3.size()!= SIZE){
                        yes = false;
                        break;
                    }
                }
            }
            System.out.println("Instancia " + inc);
            System.out.println(yes ? "SIM" : "NAO");
        }
    }
}
