package _04Builder;

public class Main {

    public static void main(String[] args) {
        Person person = Person
                .builder()
                .withFirstName("Mike")
                .withEmail("mike@yahoo.com")
                .build();

        System.out.println(person);
    }

}
