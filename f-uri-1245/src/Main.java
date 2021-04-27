import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (inp.hasNext()){
            int n = inp.nextInt();
            int size;
            int[] left = new int[31];
            int[] right = new int[31];
            String s;
            for (int i=0; i<n; i++){
                size = inp.nextInt();
                s = inp.next();
                if(s.charAt(0) == 'D'){
                    right[size-30]++;
                } else if (s.charAt(0) == 'E'){
                    left[size-30]++;
                }
            }
            int amount = 0;
            for (int i=0; i< left.length; i++){
                amount += Math.min(left[i], right[i]);
            }
            System.out.println(amount);
        }
    }
}
