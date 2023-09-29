package _03BuildPattern;

public class Main {

    public static void main(String[] args) {
        Address address1 = Address.builder()
                .withName("Michelle")
                .withEmail("michelle@abv.bg")
                .build();

        sendInvoice(address1);

        Address address2 = Address.builder()
                .withName("Michelle")
                .build();

        sendInvoice(address2);
    }

    private static void sendInvoice(Address address) {
        System.out.println("Sent to: " + System.lineSeparator() + address);
    }
}
