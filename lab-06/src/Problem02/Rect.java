package Problem02;

public class Rect {
    private int x;
    private int y;
    private int w;
    private int h;

    public Rect (int x, int y, int w, int h){
        if (w < 0){
            throw new IllegalArgumentException("Rectangle width is less than 0");
        }
        if (h < 0){
            throw new IllegalArgumentException("Rectangle height is less than 0");
        }

        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public boolean contain(int xClick, int yClick) {
        return x+w >= xClick && x <= xClick && y+h >= yClick && y <= yClick;
    }

    @Override
    public String toString() {
        return String.format("Rect(%d, %d, %d, %d)", x, y, w, h);
    }

}
