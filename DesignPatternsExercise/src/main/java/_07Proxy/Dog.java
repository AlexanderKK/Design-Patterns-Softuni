package _07Proxy;

public class Dog implements Animal {

    //before
    @Override
    public void speak() {
        System.out.println("Bark bark");
    }
    //after

}
