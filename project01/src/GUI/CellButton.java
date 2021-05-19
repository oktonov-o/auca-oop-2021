package GUI;

import processing.core.PApplet;

public class CellButton extends MyButton{
    public String text;

    public CellButton(Main main, int x, int y, int w, int h, String text, Actionable action) {
        super(main, x, y, w, h, action);
        this.text = text;
    }

    public void draw() {
        super.draw();
        float xCenter = x+w/2f;
        float yCenter = y+h/2f;
        main.fill(255, 0, 0);
        main.textSize(30);
        main.textAlign(PApplet.CENTER, PApplet.CENTER);
        main.text(text, xCenter, yCenter);
    }
}
