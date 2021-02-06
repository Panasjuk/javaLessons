package beverages;

import java.util.HashMap;

public class JinTonic extends Beverage {
    public JinTonic() {
        super("JinTonic", new HashMap<String, Integer>(){{
            put("jin", 100);
            put("tonic", 200);
        }});
    }
}
