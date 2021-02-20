import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (inp.hasNextLine()){
            String s1 = inp.nextLine();
            String s2 = inp.nextLine();
            int max = 0;
            for (int i=0; i<s1.length(); i++){
                for (int j=0; j<s2.length(); j++){
                    if (s1.charAt(i)==s2.charAt(j)){
                        int cnt = 1;
                        for (int x=1; x+i < s1.length() && x+j < s2.length(); x++){
                            if (s1.charAt(i+x)==s2.charAt(j+x)){
                                ++cnt;
                            } else {
                                break;
                            }
                        }
                        if (cnt > max){
                            max = cnt;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}


