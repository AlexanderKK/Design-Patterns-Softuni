package _04CommandPattern;

import java.util.Map;

public class CommandRepository {

    private Map<String, PlayerCommand> commandsByName;

    public CommandRepository(Player player) {
        this.commandsByName = setCommands(player);
    }

    private Map<String, PlayerCommand> setCommands(Player player) {
        return Map.of("DodgeAttack", new DodgeAttack(player));
    }

    public String execute(String commandName) {
        return commandsByName.get(commandName).execute();
    }

}
