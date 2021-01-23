package Beverages;

import java.util.Arrays;
import java.util.HashSet;

public class CubaLibre extends Beverage {
    public CubaLibre() {
        super("CubaLibre", new HashSet<>());
        String[] i = {"rum", "cola", "lime"};
        ingredients.addAll(Arrays.asList(i));
    }
}
