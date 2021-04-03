import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size, male, female, day = 1;
        String s;
        while (inp.hasNextLine()){
            male = 0;
            female = 0;
            size = inp.nextInt();
            inp.nextLine();
            s = inp.nextLine();
            while (s.indexOf(Integer.toString(size)) != -1){
                if (s.charAt(s.indexOf(Integer.toString(size))+Integer.toString(size).length()+1) == 'F'){
                    female++;
                }else {
                    male++;
                }
                s = deleteCharAt(s, s.indexOf(Integer.toString(size)));
            }
            System.out.printf("Caso %d:%n", day);
            day++;
            System.out.printf("Pares Iguais: %d%n", male+female);
            System.out.printf("F: %d%n", female);
            System.out.printf("M: %d%n", male);
        }
    }

    private static String deleteCharAt(String strValue, int index) {
        return strValue.substring(0, index) + strValue.substring(index + 1);
    }
}
