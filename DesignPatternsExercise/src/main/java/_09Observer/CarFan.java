package _09Observer;

public class CarFan implements Observer {

    @Override
    public void update(String update) {
        System.out.println("Car fan received the update " + update);
    }

}
