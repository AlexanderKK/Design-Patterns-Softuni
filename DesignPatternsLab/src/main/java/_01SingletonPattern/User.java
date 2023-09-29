package _01SingletonPattern;

public class User {
    public static int userCount = 0;

    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("--Singleton.User %d--%nusername: %s%nemail: %s", ++userCount, username, email);
    }
}
