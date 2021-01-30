import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true){
            int n = inp.nextInt();
            int m = inp.nextInt();
            if (n==0 && m==0){
                break;
            }
            int sum = m+n;
            String s = String.valueOf(sum);
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) != '0'){
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
