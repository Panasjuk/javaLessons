import beverages.*;
import userInput.CommandExecutor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bartender implements CommandExecutor{

    private final Warehouse warehouse;
    private HashSet<Beverage> menu = new HashSet<>();

    public Bartender(Warehouse warehouse){
        this.warehouse = warehouse;
        createMenu();
    }

    private void createMenu() {
        menu.add(new CubaLibre());
        menu.add(new Daikiri());
        menu.add(new MaiTai());
        menu.add(new JinTonic());
    }

    @Override
    public void execute(String command) {
        for (Beverage b : menu){ // pattern matcher
            if (command.toLowerCase().contains(b.getBeverageName().toLowerCase())){
                tryMakeBeverage(b);
                return;
            }
        }

        System.out.println("I don't know such beverage, please ask for something else.");
    }

    private void tryMakeBeverage(Beverage beverage) {
        HashMap<String, Integer> mixer = new HashMap<>();
        for(Map.Entry<String, Integer> ingredient : beverage.getIngredients().entrySet()){
            if (warehouse.take(ingredient.getKey(), ingredient.getValue())){
                mixer.put(ingredient.getKey(), ingredient.getValue());
            }
            else {
                for (Map.Entry<String, Integer> leftover : beverage.getIngredients().entrySet()){
                    warehouse.add(leftover.getKey(), leftover.getValue());
                }
                System.out.println("Not enough " + ingredient.getKey());
                return;
            }
        }

        System.out.println("Here you are: " + beverage.getBeverageName());
    }
}
