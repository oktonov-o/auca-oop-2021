import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String d, s;
        while (inp.hasNext()){
            boolean isResistant = false;
            d = inp.next();
            s = inp.next();
            if (d.length() >= s.length()){
                int x = 0;
                while (x <= d.length()-s.length()){
                    if (d.startsWith(s, x)) {
                        isResistant = true;
                        break;
                    }
                    ++x;
                }
            }
            if (isResistant){
                System.out.println("Resistente");
            } else {
                System.out.println("Nao resistente");
            }
        }
    }
}
