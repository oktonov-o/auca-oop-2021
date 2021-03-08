import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        String s;
        int sum, cnt, beg=0, end=0;
        while (t>0){
            s = inp.next();
            sum = 0;
            cnt = 3;
            while (cnt>0){
                for (int i=s.length()-1; i>=0; i--){
                    if (Character.isDigit(s.charAt(i))){
                        end = i;
                        break;
                    }
                }
                for (int i=end; i>=0; i--){
                    if (Character.isLetter(s.charAt(i))){
                        beg = i+1;
                        break;
                    }
                }
                sum += Integer.parseInt(s.substring(beg, end+1));
                s = s.replace(s.substring(beg), "");
                --cnt;
            }
            System.out.println(sum);
            --t;
        }
    }
}
