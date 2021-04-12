package Exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long n = inp.nextLong();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits (long n){
        if (n == 0){
            return 0;
        } else {
            return (int)(n%10 + sumDigits(n/10));
        }
    }
}
