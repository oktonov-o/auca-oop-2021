import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final String NAME = "zelda";
        String s = inp.next();
        s = s.toLowerCase();
        boolean isCorrect = false;
        for(int i=0; i<=s.length()-NAME.length(); i++){
            if (s.startsWith(NAME, i)){
                isCorrect = true;
                break;
            }
        }
        if (isCorrect){
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }
    }
}
