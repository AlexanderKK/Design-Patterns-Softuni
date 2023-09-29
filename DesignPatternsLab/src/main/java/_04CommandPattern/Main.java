package _04CommandPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //INVOKER is the main method
        Player player = new Player(13, 69);
        CommandRepository commandRepository = new CommandRepository(player);

        String command = scanner.nextLine();
        while(!"End".equals(command)) {
            //RECEIVER is console
            System.out.println(commandRepository.execute(command));

            command = scanner.nextLine();
        }
    }

}
