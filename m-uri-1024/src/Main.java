import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        inp.nextLine();
        for (int i = 0; i<n; i++){
            String s = inp.nextLine();
            char[] v1 = s.toCharArray();
            char[] v2 = new char[s.length()];
            for (int j=0; j<s.length(); j++){
                if(Character.isLetter(v1[j])){
                    v1[j] += 3;
                }
                if (j<s.length()/2f){
                    v2[s.length()-j-1] = (char)(v1[j] - 1);
                } else {
                    v2[s.length()-j-1] = v1[j];
                }
            }
            s = new String(v2);
            System.out.println(s);
        }
    }
}
