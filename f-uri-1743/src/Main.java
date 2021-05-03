import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] a = new int[5];
        boolean yes = true;
        for (int i=0; i<a.length; i++)
            a[i] = inp.nextInt();

        for (int i=0; i<a.length; i++)
            if (a[i] == inp.nextInt()) yes = false;
        if (yes){
            System.out.println('Y');
        } else {
            System.out.println('N');
        }
    }
}
