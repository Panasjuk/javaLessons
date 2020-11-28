package exercise2;

public class GenericBoolean implements GenericMethodInterface<Boolean> {
    @Override
    public Boolean doSomething(Boolean data) {
        return !data;
    }
}
