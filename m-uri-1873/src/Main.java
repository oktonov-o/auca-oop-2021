import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] s = {"tesoura", "papel" , "pedra", "lagarto", "spock"};

        int t = inp.nextInt();
        for (int i=0; i<t; i++){
            String first = inp.next();
            String second = inp.next();
            int index1 = -1, index2 = -1;
            for (int j=0; j<s.length; j++){
                if (first.equals(s[j])){
                    index1 = j;
                }
                if (second.equals(s[j])){
                    index2 = j;
                }
            }
            if ((index1 + 1)%5 == index2 || (index1 + 3)%5 == index2){
                System.out.println("rajesh");
            } else if ((index2 + 1)%5 == index1 || (index2 + 3)%5 == index1){
                System.out.println("sheldon");
            } else {
                System.out.println("empate");
            }
        }
    }
}
