import Beverages.*;
import UserInput.CommandExecutor;

import java.util.HashSet;

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
    public void Execute(String command) {
        for (Beverage b : menu){
            if (command.toLowerCase().contains(b.getBeverageName().toLowerCase())){
                tryMakeBeverage(b);
                return;
            }
        }

        System.out.println("I don't know such beverage, please ask for something else.");
    }

    private void tryMakeBeverage(Beverage beverage) {
        HashSet<String> mixer = new HashSet<>();
        for(String ingredient : beverage.getIngredients()){
            if (warehouse.take(ingredient, 1)){
                mixer.add(ingredient);
            }
            else {
                for (String leftover : mixer){
                    warehouse.add(leftover, 1);
                }
                System.out.println("Not enough " + ingredient);
                return;
            }
        }

        System.out.println("Here you are: " + beverage.getBeverageName());
    }
}
