import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s;
        while (inp.hasNext()) {
            s = inp.next();
            for (int row = 0; row < s.length(); row++) {
                for (int col = 0; col < s.length(); col++) {
                    if (col < row) {
                        System.out.print(" ");
                    } else {
                        System.out.print(s.charAt(col - row));
                        if (col + 1 == s.length()) {
                            break;
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
