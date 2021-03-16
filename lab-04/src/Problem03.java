import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {
    static final int N = 100000;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        MyArrayList list = new MyArrayList();
        ArrayList<Integer> arr = new ArrayList<>();

        long beg1 = System.currentTimeMillis();
        while (inp.hasNextInt()) {
            int x = inp.nextInt();
            arr.add(x);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("milliseconds 1-experiment (Standard array List) : " + (end1 - beg1));

        System.out.println(arr.toString());

        long beg2 = System.currentTimeMillis();
        while (inp.hasNextInt()) {
            int x = inp.nextInt();
            list.add(x);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("milliseconds 1-experiment: " + (end2 - beg2));

        System.out.println(list.toString());

    }
}