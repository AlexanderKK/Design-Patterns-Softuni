package _09Observer;

public interface Subject {

    void register(Observer observer);

    void remove(Observer observer);

    void notify(String update);

}
