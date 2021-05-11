import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        final int SIZE = 101;

        int n = inp.nextInt();
        int k = inp.nextInt();
        int cnt;
        while (n !=0 && k != 0){
            int[] frequency = new int[SIZE];
            cnt=0;
            for(int i=0; i<n ;i++){
                frequency[inp.nextInt()]++;
            }

            for(int i=0; i<SIZE; i++){
                if(frequency[i] >= k){
                    cnt++;
                }
            }
            System.out.println(cnt);

            n = inp.nextInt();
            k = inp.nextInt();
        }
    }
}
