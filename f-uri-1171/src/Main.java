import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        final int MAX_SIZE = 2000;
        int[] counter = new int[MAX_SIZE+1];

        int n = inp.nextInt();

        int x;
        for (int i=0; i<n; i++){
            x = inp.nextInt();
            counter[x]++;
        }

        for (int i=0; i< counter.length; i++){
            if (counter[i] > 0){
                System.out.printf("%d aparece %d vez(es)%n", i, counter[i]);
            }
        }
    }
}
