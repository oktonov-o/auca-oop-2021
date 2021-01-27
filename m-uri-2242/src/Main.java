import java.util.Scanner;

public class Main {
    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            for (char vowel : vowels) {
                if (s.charAt(i) == vowel) {
                    s1.append(s.charAt(i));
                }
                char c = s.charAt(s.length() - 1 - i);
                if (c == vowel) {
                    s2.append(c);
                }
            }
        }
        String v1 = s1.toString();
        String v2 = s2.toString();

        if (v1.equals(v2)){
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
