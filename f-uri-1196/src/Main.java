import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String qwerty = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

        while (inp.hasNextLine()){
            String s = inp.nextLine();
            StringBuilder res = new StringBuilder();
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == ' '){
                    res.append(' ');
                } else {
                    res.append(qwerty.charAt(qwerty.indexOf(s.charAt(i))-1));
                }
            }
            System.out.println(res);
        }
    }
}
