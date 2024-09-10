// LinkedListStack.java
import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T item) {
        list.addFirst(item); // Adds to the top of the stack
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst(); // Removes from the top of the stack
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getFirst(); // Peeks at the top of the stack
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
