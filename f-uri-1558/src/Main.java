import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int c, t;
        while (inp.hasNext()){
            c = inp.nextInt();
            t = (int)Math.ceil(Math.sqrt(c));
            boolean yes = false;
            for (int i=0; i<=t; i++){
                for (int j=0; j<=t; j++){
                    if (i*i+j*j == c){
                        yes = true;
                        break;
                    }
                }
            }
            if (yes){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
