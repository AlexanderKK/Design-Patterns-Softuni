package _01Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        try {
            Thread.sleep(4_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Connected to database");
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public void readFromDB() {
        System.out.println("Reading from DB");
    }

    public void writeToDB() {
        System.out.println("Writing to DB");
    }

}
