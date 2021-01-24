import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
            String d = inp.next();
            String s = inp.next();
            StringBuilder answer = new StringBuilder();
            int cnt=0;
            if (d.equals("0") && s.equals("0")){
                break;
            }
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) != d.charAt(0)){
                    if (s.charAt(i) == '0' && cnt != 0) {
                        answer.append(s.charAt(i));
                    } else if (s.charAt(i) != '0'){
                        answer.append(s.charAt(i));
                        cnt++;
                    }
                }
            }
            if (cnt==0) {
                answer = new StringBuilder("0");
            }
            System.out.println(answer);
        }
    }
}
