package Problem03;

public class Rect extends Figure{
    private int w;
    private int h;

    public Rect(int x, int y, int w, int h){
        super(x,y);
        if (w < 0){
            throw new IllegalArgumentException("Rectangle width is less than 0");
        }
        if (h < 0){
            throw new IllegalArgumentException("Rectangle height is less than 0");
        }
        this.w = w;
        this.h = h;
    }

    public boolean contains(int xClick, int yClick) {
        return x+w >= xClick && x <= xClick && y+h >= yClick && y <= yClick;
    }

    @Override
    public String toString() {
        return String.format("Rect(%d, %d, %d, %d)", x, y, w, h);
    }

}
