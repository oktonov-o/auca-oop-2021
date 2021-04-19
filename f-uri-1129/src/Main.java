import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int x, ans;
        boolean first;
        char[] answer = new char[] {'A', 'B', 'C', 'D', 'E', '*'};
        while (n != 0){
            for (int i=0; i<n; i++){
                first = true;
                ans = 5;
                for (int j=0; j<5; j++){
                    x = inp.nextInt();
                    if (x <= 127){
                        if (first){
                            ans = j;
                            first = false;
                        } else {
                            ans = 5;
                        }
                    }
                }
                System.out.println(answer[ans]);
            }

            n = inp.nextInt();
        }
    }
}
