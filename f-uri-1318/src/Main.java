import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int m = inp.nextInt();
        int x;
        while (n != 0 && m != 0){
            int[] tickets = new int[n];
            int cnt = 0;
            for (int i=0; i<m; i++){
                x = inp.nextInt();
                tickets[x-1]++;
            }
            for (int i=0; i<n; i++){
                if(tickets[i] > 1)
                    cnt++;
            }

            System.out.println(cnt);

            n = inp.nextInt();
            m = inp.nextInt();
        }
    }
}
