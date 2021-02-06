package userInput;

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
        return command == UserCommand.EXIT;
    }

    private UserCommand tryGetCommandName(String userInput) {
        for (UserCommand command : UserCommand.values()){
            if (userInput.startsWith(command.getName().toLowerCase())){
                return command;
            }
        }
        return UserCommand.INCORRECT_INPUT;
    }

    private void writeInputErrorMessage() {
        System.out.println("Unknown command. Please, try again.");
        System.out.println("For help enter " + UserCommand.HELP.getName());
    }

    private void executeCommand(UserCommand command, String userInput) {
        switch (command){
            case INCORRECT_INPUT:
                writeInputErrorMessage();
                break;
            case HELP:
                writeUserInputRulesWithDescription();
                break;
            case MAKE:
                callBartender(userInput);
                break;
            case EXIT:
                System.out.println("Exiting...");
                break;
        }
    }

    private void writeUserInputRulesWithDescription() {
        //todo: add something useful
        System.out.println("//todo: add something useful?");
    }

    private void callBartender(String userInput) {
        bartender.execute(userInput);
    }
}
