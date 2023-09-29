package _04Builder.softuni;

import java.util.*;

public class Main {

    private static final String CREATE_COMMAND = "CREATE";
    private static final String CONTACT_INFO_COMMAND = "INFO";
    private static final String DELETE_CONTACT_COMMAND = "DELETE";
    private static final String PHONEBOOK_COMMAND = "PHONEBOOK";
    private static final String END_COMMAND = "END";

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Phonebook phonebook = new Phonebook();

        try {
            Contact contact1 = Contact.builder()
                    .withName("Mike")
                    .withCompany("tysonOOD")
                    .withBirthday("02/01/1999")
                    .build();

            phonebook.addContact(contact1);

            Contact contact2 = Contact.builder()
                    .withName("Al")
                    .withCompany("alexOOD")
                    .withBirthday("01/12/1986")
                    .build();

            phonebook.addContact(contact2);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        phonebook.getAllContacts().forEach(System.out::println);
    }

}
