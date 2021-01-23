package Beverages;

import java.util.HashSet;

public class Beverage {
    protected String name;
    protected HashSet<String> ingredients;

    public Beverage(String name, HashSet<String> ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getBeverageName() {
        return name;
    }

    public HashSet<String> getIngredients() {
        return new HashSet<>(ingredients);
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
