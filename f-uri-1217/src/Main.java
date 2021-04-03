import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int cnt;
        float price, amountKG = 0, amountCash = 0;
        String s;
        inp.nextLine();
        for (int test = 0; test<t; test++){
            price = inp.nextFloat();
            amountCash += price;
            inp.nextLine();
            s = inp.nextLine();
            cnt = 1;
            while (-1 != s.indexOf(' ')){
                s = deleteCharAt(s , s.indexOf(' '));
                cnt++;
            }
            System.out.printf("day %d: %d kg%n", test+1, cnt);
            amountKG += cnt;
        }
        System.out.printf("%.2f kg by day%n", amountKG/t);
        System.out.printf("R$ %.2f by day%n", amountCash/t);
    }

    private static String deleteCharAt(String strValue, int index) {
        return strValue.substring(0, index) + strValue.substring(index + 1);
    }
}
