import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int tests = inp.nextInt();
        inp.nextLine();
        for (int test=0; test<tests; test++){
            StringBuilder eaten = new StringBuilder();
            ArrayList <String> newList = new ArrayList<String>();
            String list = inp.nextLine();
            eaten.append(inp.nextLine());
            eaten.append(inp.nextLine());
            for (int i=0; i<list.length(); i++){
                if (eaten.indexOf(Character.toString(list.charAt(i))) < 0){
                    newList.add(Character.toString(list.charAt(i)));
                } else {
                    eaten.deleteCharAt(eaten.indexOf(Character.toString(list.charAt(i))));
                }
            }
            if (eaten.length() != 0){
                System.out.println("CHEATER");
            } else {
                String[] answer = new String[newList.toArray().length];
                for(int i=0; i<answer.length; i++){
                    answer[i] = newList.get(i);
                }
                Arrays.sort(answer);
                for(int i=0; i<answer.length; i++){
                    System.out.print(answer[i]);
                }
                System.out.println();
            }
        }
    }
}
