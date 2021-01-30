import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();

        for (int i=0; i<t; i++){
            int l = inp.nextInt();
            int sum = 0;
            for (int j=0; j<l; j++){
                String s = inp.next();
                for (int x=0; x<s.length(); x++){
                    sum += s.charAt(x)-'A'+ j + x;
                }
            }
            System.out.println(sum);
        }
    }
}
