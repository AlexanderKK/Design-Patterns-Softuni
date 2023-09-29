package _01Singleton;

public class Main {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.readFromDB();
        databaseConnection.writeToDB();

        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        databaseConnection2.readFromDB();
        databaseConnection2.writeToDB();
    }

}
