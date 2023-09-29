package _01SingletonPattern.SoftuniExample;

import java.util.HashMap;
import java.util.Map;

public class SingletonDataContainer implements SingletonContainer {

    private static SingletonDataContainer instance;
    private final Map<String, Integer> capitals;

    private SingletonDataContainer() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        capitals = new HashMap<>();
        System.out.println("Initializing singleton object");
    }

    public int getPopulation(Map<String, Integer> capitals, String name) {
        return capitals.get(name);
    }

    public static SingletonDataContainer getInstance() {
        if (instance != null){
            return instance;
        }

        instance = new SingletonDataContainer();

        return instance;
    }

}

