import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            String s = inp.next();
            StringBuilder ans = new StringBuilder();
            if (s.length() == 3 && (s.charAt(0) == 'U' && s.charAt(1) == 'R' || s.charAt(0) == 'O' && s.charAt(1) == 'B')) {
                ans.append(s.charAt(0));
                ans.append(s.charAt(1));
                ans.append('I');
            } else {
                ans.append(s);
            }
            System.out.print(ans);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
