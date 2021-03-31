import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
            int n = inp.nextInt();
            if (n==0) break;
            int mary = 0;
            int john = 0;
            for (int i=0; i<n; i++){
                int x = inp.nextInt();
                if (x==0){
                    mary++;
                } else {
                    john++;
                }
            }
            System.out.printf("Mary won %d times and John won %d times%n", mary, john);
        }
    }
}
