import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String[] pomekons = new String[n];
        for (int i=0; i<n; ++i){
            pomekons[i] = inp.next();
        }
        for(int i=0;i<n;++i) {
            for (int j = i + 1; j < n; ) {
                if (pomekons[i].equals(pomekons[j])) {
                    for (int k = j; k < n - 1; ++k) {
                        pomekons[k] = pomekons[k + 1];
                    }
                    --n;
                } else {
                    ++j;
                }
            }
        }
        System.out.println("Falta(m) "+(151-n)+" pomekon(s).");
    }
}
