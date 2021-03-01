import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int p, i, proc, clock;

        while (inp.hasNext()) {
            String c = inp.next();
            p = inp.nextInt();
            proc = clock = 0;
            for (i = 0; i < c.length(); i++) {
                if (c.charAt(i) == 'W') {
                    clock++;
                    if (proc > 0) {
                        proc = 0;
                        clock++;
                    }
                } else {
                    proc++;
                    if (proc == p) {
                        clock++;
                        proc = 0;
                    }
                }
            }
            if (proc > 0)
                clock++;
            System.out.println(clock);
        }
    }
}
