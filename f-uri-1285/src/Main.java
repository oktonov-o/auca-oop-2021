import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, m, cnt, tempI;
        boolean ok;
        while (inp.hasNext()){
            n = inp.nextInt();
            m = inp.nextInt();
            cnt = 0;

            for(int i=n; i<=m; i++){
                int[] digits = new int[10];
                tempI = i;
                ok = true;
                while (tempI >= 1){
                    digits[tempI%10]++;
                    tempI /= 10;
                }
                for (int d=0; d<10; d++){
                    if (digits[d]>1){
                        ok = false;
                        break;
                    }
                }
                if (ok) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
