package _09Observer;

public class Main {

    public static void main(String[] args) {
        Observer carFan1 = new CarFan();
        Observer carFan2 = new CarFan();
        Observer carFan3 = new CarFan();

        Subject topGearShow = new TopGearShow();

        topGearShow.register(carFan1);
        topGearShow.register(carFan2);
        topGearShow.register(carFan3);

        topGearShow.notify("Mercedes");
        topGearShow.notify("BMW");
        topGearShow.notify("Audi");
    }

}
