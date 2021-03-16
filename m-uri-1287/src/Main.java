import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (inp.hasNextLine()){
            String n = inp.nextLine();
            boolean error = false;
            boolean anyZero = false;
            n = n.toLowerCase();
            StringBuilder s = new StringBuilder();
            for (int i=0; i<n.length(); i++){
                if(Character.isDigit(n.charAt(i))){
                    if (n.charAt(i) == '0'){
                        if (s.length() != 0){
                            s.append(0);
                        } else {
                            anyZero = true;
                        }
                    } else {
                        s.append(n.charAt(i));
                    }
                } else if(n.charAt(i) == 'o'){
                    if (s.length() !=0){
                        s.append(0);
                    } else {
                        anyZero = true;
                    }
                } else if(n.charAt(i) == 'l'){
                    s.append(1);
                } else if(n.charAt(i) != ',' && n.charAt(i) != ' '){
                    error = true;
                    break;
                }
                if(s.length() == 10 && "2147483647".compareTo(s.toString()) < 0){
                    error = true;
                    break;
                }
                if (s.length() > 10){
                    error = true;
                    break;
                }
            }
            if (error){
                System.out.println("error");
            } else if (s.length() == 0){
                if (anyZero) {
                    System.out.println(0);
                } else {
                    System.out.println("error");
                }
            } else {
                int number = Integer.parseInt(s.toString());
                System.out.println(number);
            }
        }
    }
}
