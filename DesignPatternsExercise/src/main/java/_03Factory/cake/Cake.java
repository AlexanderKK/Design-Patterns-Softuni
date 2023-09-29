package _03Factory.cake;

public abstract class Cake implements CakeInterface {

    private double diameter;
    private double price;
    private int pieces;

    public Cake(double diameter, double price, int pieces) {
        this.diameter = diameter;
        this.price = price;
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "diameter=" + diameter +
                ", price=" + price +
                ", pieces=" + pieces +
                '}';
    }

}
