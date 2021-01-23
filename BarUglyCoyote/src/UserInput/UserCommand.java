package UserInput;

public enum UserCommand {
    IncorrectInput("IncorrectInput"),
    Exit("exit"),
    Make("make"),
    Help("?");

    private String name;
    public String getName() {return name;}
    UserCommand(String name){
        this.name = name;
    }
}
