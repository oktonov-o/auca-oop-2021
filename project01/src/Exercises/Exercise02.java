package Exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        int n = inp.nextInt();
        System.out.println(gcd(m, n));
    }

    private static int gcd(int m, int n) {
        if (m%n == 0){
            return n;
        } else {
            return gcd(n, m%n);
        }
    }
}
