package _01SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class Datastore {

    private static Datastore instance;

    private List<User> database;

    private Datastore() {
        database = new ArrayList<>();
    }

    public static Datastore getInstance() {
        if(instance == null) {
            instance = new Datastore();
        }

        return instance;
    }

    public void add(User user) {
        database.add(user);
    }

    public User get(int index) {
        return database.get(index);
    }

}
