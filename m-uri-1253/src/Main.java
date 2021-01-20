import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        for (int i=0; i<t; i++){
            String s = inp.next();
            int n = inp.nextInt() % 26;
            char[] v = s.toCharArray();
            for (int j=0; j<s.length(); j++){
                if ((char)(v[j]-n) >= 'A'){
                    v[j] = (char)(v[j]-n);
                } else {
                    v[j] = (char)(v[j]+26-n);
                }
            }
            String r = new String(v);
            System.out.println(r);
        }
    }
}
