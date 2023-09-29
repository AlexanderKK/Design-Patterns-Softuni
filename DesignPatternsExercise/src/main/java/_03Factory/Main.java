package _03Factory;

public class Main {

    public static void main(String[] args) {
        CakeRepo cakeRepository = new CakeRepo();
        cakeRepository.handleInput();
        cakeRepository.getCakes();
    }

}
