import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        while (true){
            n = inp.nextInt();
            if (n == 0) break;
            int[] data = new int[n];
            for (int i=0; i<n; i++){
                data[i] = inp.nextInt();
            }
            int cnt = 0;
            if (n == 2){
                if (data[0] != data[1]){
                    cnt = 2;
                }
            } else {
                for (int i=0; i<n; i++){
                    if (i != 0 && i != n-1){
                        if (data[i-1]< data[i] && data[i+1] < data [i]){
                            cnt++;
                        }
                        if (data[i-1]> data[i] && data[i+1] > data [i]){
                            cnt++;
                        }
                    }
                }
                if (data[0] > data[n-1] && data[0] > data[1] || data[0] < data[n-1] && data[0] < data[1]) cnt++;
                if (data[n-1] > data[n-2] && data[n-1] > data[0] || data[n-1] < data[n-2] && data[n-1] < data[0]) cnt++;
            }

            System.out.println(cnt);
        }
    }
}
