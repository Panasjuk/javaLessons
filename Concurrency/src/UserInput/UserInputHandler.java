package UserInput;

import java.util.Arrays;
import java.util.List;

public class UserInputHandler {

    private final CommandExecutor bartender;

    public UserInputHandler(CommandExecutor bartender){
        this.bartender = bartender;
    }

    public void writeUserInputRules() {
        List<UserCommand> commands = Arrays.asList(UserCommand.values());
        System.out.println("List of available commands: ");
        for (int i = 1; i < commands.size(); i++) {
            System.out.println(commands.get(i).getName());
        }
    }

    public boolean handleUserInput(String userInput) {
        userInput = userInput.toLowerCase();
        UserCommand command = tryGetCommandName(userInput);
        executeCommand(command, userInput);
        return command == UserCommand.Exit;
    }

    private UserCommand tryGetCommandName(String userInput) {
        for (UserCommand command : UserCommand.values()){
            if (userInput.startsWith(command.getName().toLowerCase())){
                return command;
            }
        }
        return UserCommand.IncorrectInput;
    }

    private void writeInputErrorMessage() {
        System.out.println("Unknown command. Please, try again.");
        System.out.println("For help enter " + UserCommand.Help.getName());
    }

    private void executeCommand(UserCommand command, String userInput) {
        switch (command){
            case IncorrectInput:
                writeInputErrorMessage();
                break;
            case Help:
                writeUserInputRulesWithDescription();
                break;
            case Make:
                callBartender(userInput);
                break;
            case Exit:
                System.out.println("Exiting...");
                break;
        }
    }

    private void writeUserInputRulesWithDescription() {
        //todo: add something useful
        System.out.println("//todo: add something useful?");
    }

    private void callBartender(String userInput) {
        bartender.Execute(userInput);
    }
}
