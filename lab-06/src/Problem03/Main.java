package Problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(new Rect(100, 100, 100, 100));
        figures.add(new Rect(300, 300, 200, 300));
        figures.add(new Rect(300, 300, 100, 100));
        figures.add(new Circle(200, 600, 100));
        figures.add(new Circle(400, 600, 100));
        figures.add(new Circle(300, 600, 100));

        while (true){
            int xClick = inp.nextInt();
            int yClick = inp.nextInt();

            if(xClick == -1 && yClick == -1) break;

            for (Figure f:figures){
                if(f.contains(xClick, yClick)){
                    System.out.println(f);
                }
            }
        }
    }
}
