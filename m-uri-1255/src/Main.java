import java.util.Scanner;

public class Main {
    static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        for (int i=0; i<t; i++){
            int[] alphabetIndex = new int[alphabet.length];
            for(int j=0; j<alphabet.length; j++){
                alphabetIndex[j] = 0;
            }
            String s = inp.nextLine();
            s = s.toLowerCase();
            StringBuilder ans = new StringBuilder();
            for (int x=0; x<s.length(); x++){
                for (int y=0; y<alphabet.length; y++){
                    if (s.charAt(x) == alphabet[y]){
                        alphabetIndex[y]++;
                        break;
                    }
                }
            }
            int max = 0;
            for (int index : alphabetIndex) {
                if (index > max) {
                    max = index;
                }
            }
            for (int j=0; j<alphabetIndex.length; j++){
                if (alphabetIndex[j]==max){
                    ans.append(alphabet[j]);
                }
            }

            System.out.println(ans);
        }
    }
}
