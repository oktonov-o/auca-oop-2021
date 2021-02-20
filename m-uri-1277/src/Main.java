import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for (int test =0; test <t; test++){
            int n = inp.nextInt();
            String[] student = new String[n];
            boolean[] accepted = new boolean[n];
            for (int i=0; i<n; i++){
                student[i] = inp.next();
            }
            int end = 0;
            for (int i=0; i<n; i++){
                String s = inp.next();
                int p = 0, cnt = 0;
                for (int j=0; j<s.length(); j++){
                    if(s.charAt(j)=='P'){
                        p++;
                        cnt++;
                    } else if(s.charAt(j)=='A'){
                        cnt++;
                    }
                }
                if (1.0*p/cnt >= 0.75){
                    accepted[i] = true;
                } else {
                    accepted[i] = false;
                    end = i;
                }
            }
            for (int i=0; i<n; i++){
                if(!accepted[i]){
                    System.out.print(student[i]);
                    if (i!=end){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
