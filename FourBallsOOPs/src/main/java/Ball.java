import processing.core.PApplet;

public class Ball{
    private PApplet instance;
    private static int DIAMETER = 10;
    private int speed=0;
    private int unit;
    private int ballPosition;

    public Ball(PApplet instance,int unit) {
        this.instance = instance;
        this.unit = unit;
        this.ballPosition = 100 * unit;
    }

    public void drawCircle(){
        instance.ellipse(speed,ballPosition,DIAMETER,DIAMETER);
        speed+=unit;
    }
}
