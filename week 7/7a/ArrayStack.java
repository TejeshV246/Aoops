// ArrayStack.java
public class ArrayStack<T> implements Stack<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] array;
    private int size = 0;

    public ArrayStack() {
        array = new Object[INITIAL_CAPACITY];
    }

    @Override
    public void push(T item) {
        ensureCapacity();
        array[size++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = (T) array[--size];
        array[size] = null; // Clear the reference
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
}
