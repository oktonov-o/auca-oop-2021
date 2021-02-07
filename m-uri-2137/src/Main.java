import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(inp.hasNext()){
            int n = inp.nextInt();
            int[] nArr = new int[n];
            for (int i=0; i<n; i++){
                nArr[i] = inp.nextInt();
            }
            Arrays.sort(nArr);
            for (int i=0; i<n; i++){
                System.out.printf("%04d%n", nArr[i]);
            }
        }
    }
}
