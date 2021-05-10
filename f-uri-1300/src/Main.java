import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        final int STEP = 360/60;

        int a;
        while (inp.hasNext()){
            a = inp.nextInt();
            if(a%STEP == 0){
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
