import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (inp.hasNext()){
            String s = inp.nextLine();
            StringBuilder answer = new StringBuilder();
            int cnt = 0;
            char[] arr = s.toCharArray();
            for (int i=0; i<s.length(); i++){
                if (Character.isLetter(arr[i])){
                    if (cnt%2==0){
                        arr[i]=Character.toUpperCase(arr[i]);
                    } else {
                        arr[i]=Character.toLowerCase(arr[i]);
                    }
                    answer.append(arr[i]);
                    cnt++;
                } else {
                    answer.append(arr[i]);
                }
            }
            System.out.println(answer);
        }
    }
}
