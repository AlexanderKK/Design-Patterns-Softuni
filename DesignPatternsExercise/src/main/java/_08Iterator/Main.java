package _08Iterator;

public class Main {

    public static void main(String[] args) {
        Library<Book> library = new Library<>();

        library.add(new Book("Harry", "Rowlings"));
        library.add(new Book("Potter", "JK"));

        for (Book book : library) {
            System.out.println(book);
            System.out.println(book.hashCode());
        }
    }

}
