package _03Factory;

import _03Factory.cake.Cake;
import _03Factory.reader.ConsoleReader;
import _03Factory.reader.Reader;

import java.util.ArrayList;
import java.util.List;

public class CakeRepo {

    private List<Cake> cakes;

    public CakeRepo() {
        cakes = new ArrayList<>();
    }

    public void handleInput() {
        Reader reader = new ConsoleReader();

        String command;
        while(!"Exit".equalsIgnoreCase(command = reader.readLine())) {
            String cakeType = command;

            double diameter = Double.parseDouble(reader.readLine());
            double price = Double.parseDouble(reader.readLine());
            int pieces = Integer.parseInt(reader.readLine());

            try {
                Cake cake = CakeFactory.createCake(cakeType, diameter, price, pieces);
                cakes.add(cake);
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void getCakes() {
        cakes.forEach(System.out::println);
    }

}
