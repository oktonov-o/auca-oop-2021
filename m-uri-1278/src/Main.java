import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
            int n = inp.nextInt();
            inp.nextLine();
            String[] s = new String[n];
            int max = 0;
            if (n <= 0){
                break;
            }
            for (int i=0; i<n; i++){
                s[i] = inp.nextLine();
                if (s[i].length() > max){
                    max = s[i].length();
                }
            }
            System.out.println();
            for (int i=0; i<n; i++){
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<max-s[i].length(); j++){
                    sb.append(" ");
                }
                sb.append(s[i]);

                System.out.println(sb);
                System.out.println();
            }
            System.out.println();
        }
    }
}
