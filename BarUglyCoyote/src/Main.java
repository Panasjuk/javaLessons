import userInput.UserInputHandler;

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
        warehouse.add("rum", 1560);
        warehouse.add("cola", 1540);
        warehouse.add("sugar", 56);
        warehouse.add("lime", 53);
        warehouse.add("lime juice", 8910);
        warehouse.add("liquor", 750);
        warehouse.add("jin", 500);
        warehouse.add("tonic", 5000);
        return warehouse;
    }
}
