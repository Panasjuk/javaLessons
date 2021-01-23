package Beverages;

import java.util.Arrays;
import java.util.HashSet;

public class JinTonic extends Beverage {
    public JinTonic() {
        super("JinTonic", new HashSet<>());
        String[] i = {"jin", "tonic"};
        ingredients.addAll(Arrays.asList(i));
    }
}
