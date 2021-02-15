import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (inp.hasNext()){
            String s = inp.nextLine();
            System.out.println(validator(s));
        }
    }

    private static String validator(String s) {
        String invalid = "Senha invalida.";
        String valid = "Senha valida.";
        if (s.length()<6 || s.length()>32){
            return invalid;
        }
        int lower = 0, upper = 0;
        for (int i=0; i<s.length(); i++){
            if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                return invalid;
            }
            if (Character.isLowerCase(s.charAt(i))){
                lower++;
            }
            if (Character.isUpperCase(s.charAt(i))){
                upper++;
            }
        }
        if (lower==0 || upper==0){
            return invalid;
        }
        return valid;
    }
}
