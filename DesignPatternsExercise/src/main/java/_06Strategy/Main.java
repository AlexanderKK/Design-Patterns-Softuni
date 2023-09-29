package _06Strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(Person.builder().withFirstName("Mike").withLastName("Willon").build());
        people.add(Person.builder().withFirstName("Ryan").withLastName("Nike").build());
        people.add(Person.builder().withFirstName("Pike").withLastName("Bike").build());
        people.add(Person.builder().withFirstName("Carl").withLastName("Like").build());
        people.add(Person.builder().withFirstName("Pike").withLastName("Fike").build());

        ComparatorFirstName comparatorFirstName = new ComparatorFirstName();
        people.sort(comparatorFirstName);
        System.out.println("Sorted by first name ascending");
        people.forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted by first name descending");
        people.sort(comparatorFirstName.reversed());
        people.forEach(System.out::println);

        System.out.println();

        ComparatorLastName comparatorLastName = new ComparatorLastName();

        System.out.println("Sorted by last name ascending");
        people.sort(comparatorLastName);
        people.forEach(System.out::println);

        System.out.println();

        System.out.println("Sorted by first name then by last name descending");
        people.sort(comparatorFirstName.reversed().thenComparing(comparatorLastName.reversed()));
        people.forEach(System.out::println);
    }

}
