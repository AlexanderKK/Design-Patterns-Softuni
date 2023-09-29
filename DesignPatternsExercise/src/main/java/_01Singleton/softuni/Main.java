package _01Singleton.softuni;

import _01Singleton.softuni.Hashcode;
import _01Singleton.softuni.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        String name = data[0];
        int age = Integer.parseInt(data[1]);

        Person person1 = new Person(name, age);

        data = scanner.nextLine().split("\\s+");
        name = data[0];
        age = Integer.parseInt(data[1]);
        Person person2 = new Person(name, age);

        Hashcode personHash1 = Hashcode.getInstance(person1);
        Hashcode personHash2 = Hashcode.getInstance(person2);

        System.out.println("Person's hash is: " + personHash1.hashCode());
        System.out.println("Person's hash is: " + personHash2.hashCode());
    }

}
