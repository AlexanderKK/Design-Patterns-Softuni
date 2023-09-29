package _07Proxy;

public class DogProxy implements Animal {

    private Dog dog;

    public DogProxy() {
        this.dog = new Dog();
    }

    private void before() {
        System.out.println("Before Bark");
    }

    @Override
    public void speak() {
        before();
        dog.speak();
        after();
    }

    private void after() {
        System.out.println("After Bark");
    }

}
