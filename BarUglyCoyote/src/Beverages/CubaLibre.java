package beverages;

import java.util.HashMap;

public class CubaLibre extends Beverage {
    public CubaLibre() {
        super("CubaLibre", new HashMap<String, Integer>(){{
            put("rum", 100);
            put("cola", 300);
            put("lime", 2);
        }});
    }
}
