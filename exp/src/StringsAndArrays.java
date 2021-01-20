import java.util.Scanner;

public class StringsAndArrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String s = inp.nextLine();
        char[] v = s.toCharArray();

        for (int i = 0; i<s.length(); i++){
            if (Character.isUpperCase(v[i])){
                v[i] = Character.toLowerCase(v[i]);
            } else if (Character.isLowerCase(v[i])){
                v[i] = Character.toUpperCase(v[i]);
            }
        }

        String r = new String(v);
        System.out.println(r);
    }
}
