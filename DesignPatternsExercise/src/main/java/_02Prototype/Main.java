package _02Prototype;

public class Main {

    public static void main(String[] args) {
        Prototype person1 = new Person("Mike", "Tyson", 55);
        Prototype person2 = person1.clone();

        System.out.println(person1);
        System.out.println(person2);
    }

}
