import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import processing.core.PApplet;
import processing.core.PImage;


public class Launcher extends PApplet {


    public static void main(String[] args) {
        PApplet.main("Launcher");
    }

    public void settings() {
        fullScreen(P3D);
    }

    SampleBall sampleBall = new SampleBall(this);

    //One time execution on startup
    public void setup() {
        fill(120, 50, 240);

    }

    //loop indefinitly
    public void draw() {
        background(0);
        sampleBall.update();
        sampleBall.display();
    }

    @Override
    public void keyPressed() {

		if (key == 'c' || key == 'C') {
            System.out.println("keyPressed C");
        }
        if (key == 'b' || key == 'B') {
            System.out.println("keyPressed B");
        }
        if (key == 'v' || key == 'V') {
            System.out.println("keyPressed V");
        }
        super.keyPressed();
    }

    @Override
    public void keyReleased() {
        System.out.println("keyReleased");

    }


}
