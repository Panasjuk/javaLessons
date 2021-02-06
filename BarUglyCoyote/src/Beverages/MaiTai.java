package beverages;

import java.util.HashMap;

public class MaiTai extends Beverage {
    public MaiTai() {
        super("MaiTai", new HashMap<String, Integer>(){{
            put("rum", 100);
            put("liquor", 100);
            put("lime juice", 200);
        }});
    }
}
