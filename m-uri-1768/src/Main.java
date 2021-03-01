import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        while (inp.hasNext()){
            n = inp.nextInt();
            int empty = n/2;
            for (int row =0; row<(n+1)/2; row++){
                for (int col=0; col<n-empty; col++){
                    if (col < empty){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                empty--;
                System.out.println();
            }
            empty = n/2;
            for (int row =0; row<2; row++){
                for (int col=0; col<n-empty; col++){
                    if (col < empty){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                empty--;
                System.out.println();
            }
        }
    }
}
