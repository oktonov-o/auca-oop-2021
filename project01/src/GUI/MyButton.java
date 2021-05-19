package GUI;

import processing.core.PApplet;

public class MyButton {
    private static final float DARK_GREY = 50;
    private static final float PRESSED_GREY = 125;
    private static final float LIGHT_GREY = 200;

    protected Main main;
    protected float x;
    protected float y;
    protected float w;
    protected float h;
    protected boolean isPressed;
    private Actionable action;

    public MyButton(Main main, int x, int y, int w, int h, Actionable action) {
        this.main = main;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.action=action;
    }

    public boolean contains(float xm, float ym){
        return x < xm && xm < x+w && y < ym && ym < y+h;
    }

    public void draw() {
        float d = h/20f;
        if (isPressed || contains(main.mouseX, main.mouseY)){
            main.fill(DARK_GREY);
            main.rect(x, y, w, h);
            main.fill(PRESSED_GREY);
            main.rect(x+d, y+d, w-2*d, h - 2*d);

        } else {
            main.fill(DARK_GREY);
            main.rect(x, y, w, h);
            main.fill(LIGHT_GREY);
            main.rect(x+d, y+d, w-2*d, h - 2*d);
        }
    }

    public void performAction() {
        action.perform();
        isPressed = true;
    }
}
