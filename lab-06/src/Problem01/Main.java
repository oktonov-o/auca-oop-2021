package Problem01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList <Rect> rectangles = new ArrayList<>();

        rectangles.add(new Rect(100, 100, 100, 100));
        rectangles.add(new Rect(300, 300, 200, 300));
        rectangles.add(new Rect(300, 300, 100, 100));

        while (true){
            int xClick = inp.nextInt();
            int yClick = inp.nextInt();

            if(xClick == -1 && yClick == -1) break;

            for (Rect r:rectangles){
                if(r.contain(xClick, yClick)){
                    System.out.println(r);
                }
            }
        }
    }
}
