import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i=0; i<n; ++i){
            int a = inp.nextInt();
            int b = inp.nextInt();
            StringBuilder s = new StringBuilder();
            for (int j=a; j<=b; j++){
                s.append(j);
            }
            String ans = String.valueOf(s) + s.reverse();
            System.out.println(ans);
        }
    }
}
