package exercise2;

public class GenericInteger implements GenericMethodInterface<Integer> {

    @Override
    public Integer doSomething(Integer data) {
        return data * 5;
    }
}
