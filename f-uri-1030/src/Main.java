import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n, k;
        for (int test = 1; test<=t; test++){
            n = inp.nextInt();
            k = inp.nextInt();
            System.out.printf("Case %d: %d%n", test, alive(n, k)+1);
        }
    }

    private static int alive(int n, int k) {
        int m = 0;
        for (int i = 2; i <= n; i++)
            m = (m + k) % i;
        return m;
    }
}
