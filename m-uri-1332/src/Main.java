import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();

        for (int i = 0; i <n; i++){
            String s = inp.next();
            if (s.length() == 3){
                int cnt =0;
                for (int j=0; j<s.length(); j++){
                    if(s.charAt(j)=="one".charAt(j)){
                        cnt++;
                    }
                }
                if (cnt > 1){
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(3);
            }
        }
    }
}
