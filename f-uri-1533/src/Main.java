import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int v, max, x, indexV = -1, indexMax = 1;
        while (n != 0){
            max = 0;
            v = 0;
            for(int i=0; i<n; i++){
                x = inp.nextInt();
                if (x > max){
                    v = max;
                    indexV = indexMax;
                    max = x;
                    indexMax = i+1;
                } else if (x > v){
                    v = x;
                    indexV = i+1;
                }
            }
            System.out.println(indexV);
            n = inp.nextInt();
        }
    }
}
