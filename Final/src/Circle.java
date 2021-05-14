public class Circle {

    private static int numberOfCircles;
    private int r;

    Circle(int r){
        if(r<0){
            throw new IllegalArgumentException();
        } else {
            numberOfCircles++;
        }
    }
}
