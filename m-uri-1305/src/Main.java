import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String num, cut;
        while (inp.hasNext()){
            num = inp.next();
            cut = inp.next();
            System.out.println(round(num, cut));
        }
    }

    private static int round(String numT, String cutT) {
        float num = Float.parseFloat(numT);
        float cut = Float.parseFloat(cutT);
        if (num-cut >= Math.floor(num)){
            return (int) Math.ceil(num);
        } else {
            return (int) Math.floor(num);
        }
    }
}
