import processing.core.PApplet;
import processing.core.PVector;

public class SampleBall {

    private PApplet processing;
    private PVector position;
    private PVector size;

    SampleBall(PApplet processing) {
        this.processing = processing;
        position = new PVector(processing.width / 2, processing.height / 2);
        float radius = processing.random(10, 20);
        size = new PVector(radius, radius);
    }

    public void display() {
        this.processing.ellipse(position.x, position.y, 10, 10);
    }

    public void update() {
        position.x++;
    }
}