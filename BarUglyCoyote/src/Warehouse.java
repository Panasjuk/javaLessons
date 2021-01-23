import java.util.TreeMap;

public class Warehouse {

    private TreeMap<String, Integer> storageOfIngredients = new TreeMap<>();

    public Warehouse(){}

    public void add(String ingredientName, int amount){
        if (storageOfIngredients.containsKey(ingredientName)){
            int v = storageOfIngredients.get(ingredientName);
            storageOfIngredients.put(ingredientName, v + amount);
        } else {
            storageOfIngredients.put(ingredientName, amount);
        }
    }

    public boolean take(String ingredientName, int amountToTake){
        boolean isExecutedSuccessfully = false;
        if (storageOfIngredients.containsKey(ingredientName)) {

            int currentAmount = storageOfIngredients.get(ingredientName);
            if (currentAmount >= amountToTake){
                storageOfIngredients.put(ingredientName, currentAmount - amountToTake);
                isExecutedSuccessfully = true;
            }
        }
        return isExecutedSuccessfully;
    }
}
