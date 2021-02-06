package beverages;

import java.util.HashMap;

public class Daikiri extends Beverage{
    public Daikiri() {
        super("Daikiri", new HashMap<String, Integer>(){{
            put("rum", 100);
            put("sugar", 2);
            put("lime juice", 250);
        }});
    }
}
