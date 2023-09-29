package _01SingletonPattern;

public class Main {

    public static void main(String[] args) {
        Datastore datastore1 = Datastore.getInstance();

        User user1 = new User("Mike", "mikeatspike@abv.bg");

        datastore1.add(user1);
        System.out.println(datastore1.get(0));

        Datastore datastore2 = Datastore.getInstance();
        System.out.println(datastore2.get(0));

        User user2 = new User("Alex", "alejandro@abv.bg");
        datastore2.add(user2);
        System.out.println(datastore2.get(1));
    }

}
