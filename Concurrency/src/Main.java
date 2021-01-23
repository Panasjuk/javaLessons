import UserInput.UserInputHandler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean needToStop = false;
        Scanner scanner = new Scanner(System.in);
        UserInputHandler inputHandler = new UserInputHandler(createBartender());

        inputHandler.writeUserInputRules();

        while(!needToStop){
            System.out.println("Please, enter your command:");
            String userInput = scanner.nextLine();
            needToStop = inputHandler.handleUserInput(userInput);
        }
    }

    private static Bartender createBartender() {
        return new Bartender(createWarehouse());
    }

    private static Warehouse createWarehouse() {
        Warehouse warehouse = new Warehouse();
        warehouse.add("rum", 10);
        warehouse.add("cola", 5);
        warehouse.add("sugar", 5);
        warehouse.add("lime", 5);
        warehouse.add("lime juice", 10);
        warehouse.add("liquor", 5);
        warehouse.add("jin", 5);
        warehouse.add("tonic", 5);
        return warehouse;
    }
}
