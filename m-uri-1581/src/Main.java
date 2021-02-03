import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for (int i=0; i<t; i++){
            boolean english = false;
            int n= inp.nextInt();
            String firstSpeaker = inp.next();
            for (int j=1; j<n; j++){
                String s = inp.next();
                if (!s.equals(firstSpeaker)){
                    english = true;
                }
            }
            if (english){
                System.out.println("ingles");
            } else {
                System.out.println(firstSpeaker);
            }
        }
    }
}