package beverages;

import java.util.HashMap;

public class Beverage {
    protected String name;
    protected HashMap<String, Integer> ingredients;

    public Beverage(String name, HashMap<String, Integer> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getBeverageName() {
        return name;
    }

    public HashMap<String, Integer> getIngredients() {
        return new HashMap<>(ingredients);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj.getClass() == this.getClass()){
            Beverage that = (Beverage)obj;
            result = name.equals(that.name) &&
                    ingredients.equals(that.ingredients);
        }
        return result;
    }
}
