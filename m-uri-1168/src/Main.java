import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] numberOfLed = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int t = inp.nextInt();

        inp.nextLine();
        for (int i =0; i<t; i++){
            int sum=0;
            String s = inp.next();
            for (int j = 0; j<s.length(); j++){
                int n = s.charAt(j) - 48;
                sum += numberOfLed[n];
            }
            System.out.println(sum + " leds");
        }
    }
}
