import java.util.HashMap;

public class HomeAssistant {
    String command;
    HashMap<String, Command> commands;

    public HomeAssistant() {
        this.commands = new HashMap<>();
    }

    public void doOnCommand(String instruction) {
        Command the_command =  commands.get(instruction);
        the_command.execute();
    }

    public void addCommand(String request, Command command) {
        commands.put(request, command);
    }
}
