package userInput;

public enum UserCommand {
    INCORRECT_INPUT("INCORRECT_INPUT"),
    EXIT("exit"),
    MAKE("make"),
    HELP("?");

    private String name;
    public String getName() {return name;}
    UserCommand(String name) {this.name = name;}
}
