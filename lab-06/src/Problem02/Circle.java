package Problem02;

public class Circle {
    private int x;
    private int y;
    private int r;

    public Circle (int x, int y, int r){
        if (r < 0){
            throw new IllegalArgumentException("Circle radius is less than 0");
        }

        this.x = x;
        this.y = y;
        this.r = r;
    }

    public boolean contain(int xClick, int yClick) {
        int dx = xClick - x;
        int dy = yClick - y;
        return r*r >= dx*dx+dy*dy;
    }

    @Override
    public String toString() {
        return String.format("Circle(%d, %d, %d)", x, y, r);
    }
}
