import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        for (int i=0; i<t; i++){
            boolean isNew = true;
            String s = inp.nextLine();
            StringBuilder ans = new StringBuilder();
            char[] arr = s.toCharArray();
            for (int j=0; j<s.length(); j++){
                if (isNew && arr[j]!=' '){
                    ans.append(arr[j]);
                    isNew = false;
                } else if (arr[j]==' '){
                    isNew = true;
                }
            }
            System.out.println(ans);
        }
    }
}
