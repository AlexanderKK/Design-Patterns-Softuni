package _01Singleton.softuni;

public class Hashcode {

    private static Hashcode instance;

    private final Object point;

    private Hashcode(Object point) {
        this.point = point;
    }

    public static Hashcode getInstance(Object point) {
        if(instance == null) {
            instance = new Hashcode(point);
        }

        return instance;
    }

    public int hashCode() {
        return point.hashCode();
    }

}
