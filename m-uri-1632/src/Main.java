import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        String s;
        char letter;
        int variations, multiplier;
        while (t>0){
            s = inp.next();
            s = s.toLowerCase();
            variations = 1;
            for (int i=0; i<s.length(); i++){
                if (Character.isLetter(s.charAt(i))){
                    letter = s.charAt(i);
                    multiplier = 2;
                    if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 's'){
                        ++multiplier;
                    }
                } else {
                    multiplier = 1;
                }
                variations*=multiplier;
            }
            System.out.println(variations);
            --t;
        }
    }
}
