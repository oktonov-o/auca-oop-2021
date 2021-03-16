import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tests = inp.nextInt();
        inp.nextLine();
        for (int t=1; t<=tests; t++){
            String s = inp.nextLine();
            String s1 = inp.nextLine();
            String s2 = inp.nextLine();
            int w1=0, w2=0;
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == s1.charAt(i)){
                    w1++;
                }
                if (s.charAt(i) == s2.charAt(i)){
                    w2++;
                }
            }
            System.out.println("Instancia "+t);
            if (w1 > w2){
                System.out.println("time 1");
            } else if (w1 < w2){
                System.out.println("time 2");
            } else {
                int index1=s.length();
                int index2=s.length();
                for (int i=0; i<s.length(); i++){
                    if (s.charAt(i) == s1.charAt(i)){
                        index1 = i;
                    }
                    if (s.charAt(i) == s2.charAt(i)){
                        index2 = i;
                    }
                    if (index1 < index2){
                        System.out.println("time 1");
                        break;
                    } else if (index1 > index2){
                        System.out.println("time 2");
                        break;
                    } else if(i == s.length()-1) {
                        System.out.println("empate");
                    } else {
                        index1 = s.length();
                        index2 = s.length();
                    }
                }
            }
            System.out.println();
        }
    }
}
