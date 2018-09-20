package AdapterPackage;

/**
 * Created by Martin on 12-09-2018.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapter(new Rectangle()), new LineAdapter(new Line())};

        int x1 = 10, y1 = 20; // First coordinate
        int x2 = 30, y2 = 60; // Second coordinate

        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
