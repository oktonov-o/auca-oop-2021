import java.math.BigInteger;
import java.util.Scanner;

public class Exercise01 {
    static BigInteger factorial(int N) {
        if (N==0){
            return BigInteger.ONE;
        } else if (N>0) {
            BigInteger f = new BigInteger(Integer.toString(N));
            return f.multiply(factorial(N-1));
        }
        return BigInteger.valueOf(-1);
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt();
        System.out.println(factorial(N));
    }
}
