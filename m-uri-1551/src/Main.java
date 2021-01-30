import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        for (int i=0; i<t; i++){
            int sum = 0;
            int[] alphabet = new int[26];
            for (int j=0; j<26; j++){
                alphabet[j]=0;
            }
            String s = inp.nextLine();
            for (int j=0; j<s.length(); j++){
                if (Character.isLowerCase(s.charAt(j))){
                    alphabet[s.charAt(j)-'a']++;
                }
            }
            for (int j=0; j<26; j++){
                if (alphabet[j] != 0){
                    sum++;
                }
            }
            if (sum == 26){
                System.out.println("frase completa");
            } else if (sum >= 13){
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }
    }
}
