package _03Factory;

import _03Factory.cake.Cake;
import _03Factory.cake.DarkChocoCake;
import _03Factory.cake.VeganCake;
import _03Factory.cake.WhiteChocoCake;

public class CakeFactory {

    public static Cake createCake(String cakeType, double diameter, double price, int pieces) {
        Cake cake;

        switch (cakeType) {
            case "DarkChocoCake":
                cake = new DarkChocoCake(diameter, price, pieces);
                break;
            case "WhiteChocoCake":
                cake = new WhiteChocoCake(diameter, price, pieces);
                break;
            case "VeganCake":
                cake = new VeganCake(diameter, price, pieces);
                break;
            default:
                throw new IllegalArgumentException("Cake type not present");
        }

        return cake;
    }

}
