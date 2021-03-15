import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String[] names = new String[1001];
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int index=0;
        while (inp.hasNextLine()) {
            names[index] = inp.nextLine();
            index++;
        }
        String[] names2 = new String[index];
        for (int i=0; i<index; i++){
            names2[i] = names[i];
        }
        Arrays.sort(names2);
        System.out.println(names2[index-1]);
    }
}