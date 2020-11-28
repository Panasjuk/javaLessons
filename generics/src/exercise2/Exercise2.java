package exercise2;

import java.util.HashMap;

public class Exercise2 {

    private HashMap<Class, GenericMethodInterface> map;

    public Exercise2(){
        map = new HashMap<>();
        map.put(Boolean.class, new GenericBoolean());
        map.put(Integer.class, new GenericInteger());
        map.put(String.class, new GenericString());
    }
    public <T> void execute(T data){
        GenericMethodInterface i = map.get(data.getClass());
        if (i != null){
            System.out.println(i.doSomething(data));
        }
        else {
            System.out.println("realization of " + data.getClass() + " is not supported");
        }
    }
}
