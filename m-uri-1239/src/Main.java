import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(inp.hasNextLine()){
            String s = inp.nextLine();
            StringBuilder ans = new StringBuilder();
            int cntI=0, cntB = 0;
            for (int i=0; i<s.length(); i++){
                if (s.charAt(i) == '_'){
                    if (cntI%2==0){
                        ans.append("<i>");
                    } else {
                        ans.append("</i>");
                    }
                    cntI++;
                } else if (s.charAt(i) == '*'){
                    if (cntB%2==0){
                        ans.append("<b>");
                    } else {
                        ans.append("</b>");
                    }
                    cntB++;
                } else {
                    ans.append(s.charAt(i));
                }
            }
            System.out.println(ans);
        }
    }
}
