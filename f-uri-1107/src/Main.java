import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean b;
        int a, c, cnt, w, x, tmp;
        a = inp.nextInt();
        c = inp.nextInt();
        while (a !=0 && c!=0) {
            cnt = 0;
            b = false;
            tmp = w = a;
            for(int i = 0; i < c; i++)
            {
                x = inp.nextInt();
                if (x <= tmp) b = false;
                else{
                    if (!b) cnt += w - tmp;
                    w = x;
                    b = true;
                }
                tmp = x;
            }
            if (!b)
                cnt += w - tmp;
            System.out.println(cnt);

            a = inp.nextInt();
            c = inp.nextInt();
        }
    }
}
