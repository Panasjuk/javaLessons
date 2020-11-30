// Реализовать собственный стек, сделать его параметризированным,
// чтоб каждый инстанс стека работал только со своим типом данных.
// У стека должны быть методы: push(T obj), pop(), peek().
// pop извлекает верхний элемент из стека, а peek оставляет его на месте.

public class GenericStack<T> {

    private GenericNode<T> node;

    public GenericStack() {
    }

    public GenericStack(T obj) {
        if (obj != null) {
            node = new GenericNode<>(obj, null);
        }
    }

    public void push(T obj) {
        if (obj != null) {
            node = new GenericNode<>(obj, node);
        }
    }

    public T pop() {
        T result;
        if (node != null) {
            result = node.data;
            node = node.previous;
        } else {
            result = null;
        }
        return result;
    }

    public T peek() {
        return node == null ? null : node.data;
    }


    private class GenericNode<T> {
        T data;
        GenericNode<T> previous;

        GenericNode(T data, GenericNode<T> previousNode) {
            this.data = data;
            if (previousNode != null) {
                previous = previousNode;
            }
        }
    }
}

