package Beverages;

import java.util.Arrays;
import java.util.HashSet;

public class Daikiri extends Beverage{
    public Daikiri() {
        super("Daikiri", new HashSet<>());
        String[] i = {"rum", "sugar", "lime juice"};
        ingredients.addAll(Arrays.asList(i));
    }
}
