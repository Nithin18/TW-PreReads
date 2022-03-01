import processing.core.PApplet;

public class FourBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private Ball b1;
    private Ball b2;
    private Ball b3;
    private Ball b4;


    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        b1 = new Ball(this,1);
        b2 = new Ball(this,2);
        b3 = new Ball(this,3);
        b4 = new Ball(this,4);
    }

    @Override
    public void draw() {
        b1.drawCircle();
        b2.drawCircle();
        b3.drawCircle();
        b4.drawCircle();
    }
}
