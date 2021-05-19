package GUI;

import processing.core.PApplet;

public class CommandButton extends MyButton {
    String text;

    public CommandButton(Main main, int x, int y, int w, int h, String text, Actionable action) {
        super(main, x, y, w, h, action);
        this.text = text;
    }

    @Override
    public void draw() {
        super.draw();
        float xCenter = x+w/2f;
        float yCenter = y+h/2f;
        main.fill(0, 255, 0);
        main.textSize(20);
        main.textAlign(PApplet.CENTER, PApplet.CENTER);
        main.text(text, xCenter, yCenter);
    }
}
