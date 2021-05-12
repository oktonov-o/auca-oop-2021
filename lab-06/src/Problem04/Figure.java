package Problem04;

public abstract class Figure {
    protected int x;
    protected int y;


    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean contains(int x, int y);

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }


}
