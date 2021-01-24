import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        for (int i=0; i<t; i++){
            String s = inp.nextLine();
            StringBuilder ans = new StringBuilder();
            char[] arr = s.toCharArray();
            for (int j=s.length()/2-1; j>=0; j--){
                ans.append(arr[j]);
            }
            for (int j=s.length()-1; j>=s.length()/2; j--){
                ans.append(arr[j]);
            }
            System.out.println(ans);
        }
    }
}
