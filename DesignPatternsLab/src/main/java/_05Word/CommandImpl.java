package _05Word;

import java.util.*;

public class CommandImpl implements CommandInterface {

    private final Map<String, TextTransform> commandTransforms;
    private final StringBuilder text;

    public CommandImpl(StringBuilder text) {
        this.commandTransforms = new HashMap<>();
        this.text = text;
        init();
    }

    @Override
    public void init() {
        this.commandTransforms.clear();

        List<Command> commands = initCommands();
        for (Command command : commands) {
            this.commandTransforms.putIfAbsent(command.getText(), command.getTextTransform());
        }
    }

    @Override
    public void handleInput(String input) {
        String[] tokens = input.split("\\s+");

        String commandName = tokens[0];
        int startInd = Integer.parseInt(tokens[1]);
        int endInd = Integer.parseInt(tokens[2]);

        this.commandTransforms.get(commandName).invokeOn(this.text, startInd, endInd);
    }

    private List<Command> initCommands() {
        List<Command> commands = new ArrayList<>();

        CutTransform cutTransform = new CutTransform();

        Command commandUppercase = new Command("uppercase", new ToUpperTransform());
        Command commandCut = new Command("cut", cutTransform);
        Command commandPaste = new Command("paste", new PasteTransform(cutTransform));

        commands.add(commandUppercase);
        commands.add(commandCut);
        commands.add(commandPaste);

        return commands;
    }

}
