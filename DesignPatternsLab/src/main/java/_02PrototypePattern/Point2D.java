package _02PrototypePattern;

public class Point2D implements Cloneable {

    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Point2D(Point2D other) {
        this(other.x, other.y);
    }

    public Point2D clone() {
        return new Point2D(this);
    }

}
