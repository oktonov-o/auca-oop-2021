import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int cnt;
        while (n != 0){
            cnt =1;
            while (true){
                if (remain(n, cnt) != 11) {
                    cnt++;
                } else break;
            }
            System.out.println(cnt);

            n = inp.nextInt();
        }
    }
    private static int remain(int n, int cnt) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            r = (r + cnt) % i;
        }
        return r;
    }
}
