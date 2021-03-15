import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        while (inp.hasNextLine()) {
            String c = inp.nextLine();
            names.add(c);
        }
        Collections.sort(names, Collator.getInstance(new Locale("es")));

        System.out.println(names.get(names.size() - 1));
    }
}