import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tests = inp.nextInt();
        for (int test=0; test<tests; test++){
            StringBuilder eaten = new StringBuilder();
            StringBuilder list = new StringBuilder();
            list.append(inp.nextLine());
            eaten.append(inp.nextLine());
            eaten.append(inp.nextLine());
            System.out.println(list);
        }
    }
}
