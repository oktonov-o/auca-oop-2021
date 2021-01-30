import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int t = inp.nextInt();
        for (int i=0; i<t; i++){
            String a = inp.next();
            String b = inp.next();
            int sum =0;
            for (int j=0; j<a.length(); j++){
                if (a.charAt(j) <= b.charAt(j)){
                    sum += b.charAt(j)-a.charAt(j);
                } else {
                    sum += b.charAt(j) - a.charAt(j) + 26;
                }
            }
            System.out.println(sum);
        }
    }
}
