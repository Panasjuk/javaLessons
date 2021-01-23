package Beverages;

import java.util.Arrays;
import java.util.HashSet;

public class MaiTai extends Beverage {
    public MaiTai() {
        super("MaiTai", new HashSet<>());
        String[] i = {"rum", "liquor", "lime juice"};
        ingredients.addAll(Arrays.asList(i));
    }
}
