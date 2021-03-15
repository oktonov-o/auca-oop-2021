import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            int n = inp.nextInt();
            int m = inp.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                words[i] = inp.next();
            }
            int a = inp.nextInt();
            int b = inp.nextInt();
            int width = b / m;
            int height = a / n;
            for (int i = 0; i < n; i++) {
                StringBuilder image = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    for (int y = 0; y < width; y++) {
                        image.append(words[i].charAt(j));
                    }
                }
                for (int x = 0; x < height; x++) {
                    System.out.println(image.toString());
                }
            }
            System.out.println();
        }
    }
}
