import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(inp.hasNext()){
            String s = inp.nextLine();
            StringBuilder ans = new StringBuilder();
            int cnt=0;
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == '_'){
                    if (cnt%2==0){
                        ans.append("<i>");
                    } else {
                        ans.append("</i>");
                    }
                    cnt++;
                } else if (s.charAt(i) == '*'){
                    if (cnt%2==0){
                        ans.append("<b>");
                    } else {
                        ans.append("</b>");
                    }
                    cnt++;
                } else {
                    ans.append(s.charAt(i));
                }
            }
            System.out.println(ans);
        }
    }
}
