package exercise2;

public class GenericString implements GenericMethodInterface<String> {
    @Override
    public String doSomething(String data) {
        return new StringBuilder(data).reverse().toString();
    }
}
