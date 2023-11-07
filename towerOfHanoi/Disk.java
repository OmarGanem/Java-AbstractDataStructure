import java.awt.*;
import javax.swing.*;
/**
 * Write a description of class Disk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Disk {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 20;
    private int size;
    private Rectangle boundingBox;

    public Disk(int size) {
        this.size = size;
        boundingBox = new Rectangle(0, 0, size * WIDTH, HEIGHT);
    }

    public int getSize() {
        return size;
    }

    public boolean contains(int x, int y) {
        return boundingBox.contains(x, y);
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.fillRect(x - size * 5, y, size * 10, HEIGHT);
        boundingBox.setLocation(x - size * 5, y);
    }
}
