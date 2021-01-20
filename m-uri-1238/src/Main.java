import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int t = inp.nextInt();

        for (int i = 0; i<t; i++){
            String s1 = inp.next();
            String s2 = inp.next();
            String minS;
            String maxS;
            int indexOfWord = 0;
            if (s1.length() >= s2.length()){
                minS = s2;
                maxS = s1;
            } else {
                minS = s1;
                maxS = s2;
            }
            int length = minS.length()+maxS.length();
            char[] word = new char[length];
            for (int j=0; j<minS.length(); j++){
                word[indexOfWord] = s1.charAt(j);
                indexOfWord++;
                word[indexOfWord] = s2.charAt(j);
                indexOfWord++;
            }
            for (int j=minS.length(); j<maxS.length(); j++){
                word[indexOfWord]=maxS.charAt(j);
                indexOfWord++;
            }
            String answer = new String(word);
            System.out.println(answer);
        }
    }
}
