package Problem03;

public class Circle extends Figure {
    private int r;

    public Circle(int x, int y, int r){
        super(x,y);
        if (r < 0){
            throw new IllegalArgumentException("Circle radius is less than 0");
        }
        this.r = r;
    }

    public boolean contains(int xClick, int yClick) {
        int dx = xClick - x;
        int dy = yClick - y;
        return r*r >= dx*dx+dy*dy;
    }

    @Override
    public String toString() {
        return String.format("Circle(%d, %d, %d)", x, y, r);
    }
}
