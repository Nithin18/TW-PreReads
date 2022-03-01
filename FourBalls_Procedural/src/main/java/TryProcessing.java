import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int DIAMETER = 10;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static int speedCircle1 = 0;
    public static int speedCircle2 = 0;
    public static int speedCircle3 = 0;
    public static int speedCircle4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle1(1);
        drawCircle2(2);
        drawCircle3(3);
        drawCircle4(4);
    }

    private void drawCircle1(int unit) {
        ellipse(speedCircle1,100, DIAMETER,DIAMETER);
        speedCircle1 += unit;
    }

    private void drawCircle2(int unit) {
        ellipse(speedCircle2,200, DIAMETER,DIAMETER);
        speedCircle2 += unit;
    }

    private void drawCircle3(int unit) {
        ellipse(speedCircle3,300, DIAMETER,DIAMETER);
        speedCircle3 += unit;
    }

    private void drawCircle4(int unit) {
        ellipse(speedCircle4,400, DIAMETER,DIAMETER);
        speedCircle4 += unit;
    }
}




