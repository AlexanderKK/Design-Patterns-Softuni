package _02Prototype;

public class Person implements Prototype, Cloneable {

    private String name;
    private String email;
    private int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Prototype clone() {
        Prototype clone = null;

        try {
            clone = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
//        return new Person(name, email, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", name, email, age);
    }
}
