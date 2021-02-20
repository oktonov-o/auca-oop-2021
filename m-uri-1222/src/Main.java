import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (inp.hasNext()){
            int n = inp.nextInt();
            int l = inp.nextInt();
            int c = inp.nextInt();
            int chars = 0;
            int lines = 0;
            for (int i=0; i<n; i++){
                String s = inp.next();
                if (chars + s.length() > c){
                    chars=s.length()+1;
                    ++lines;
                    if(i==n-1){
                        ++lines;
                    }
                }else if(i==n-1){
                    lines++;
                }else  {
                    chars+=s.length()+1;
                }
            }
            System.out.println((int)Math.ceil(1.0*(lines)/l));
        }
    }
}
