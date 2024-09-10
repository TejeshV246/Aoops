// Main.java
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Test PriorityQueue with Integer
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
        intQueue.add(5);
        intQueue.add(1);
        intQueue.add(10);
        intQueue.add(3);
        System.out.println("Integer PriorityQueue - Peek: " + intQueue.peek()); // Should print 10
        System.out.println("Integer PriorityQueue - Remove: " + intQueue.remove()); // Should print 10
        System.out.println("Integer PriorityQueue - Peek: " + intQueue.peek()); // Should print 5

        // Test PriorityQueue with Double
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
        doubleQueue.add(2.5);
        doubleQueue.add(1.1);
        doubleQueue.add(3.7);
        doubleQueue.add(0.5);
        System.out.println("Double PriorityQueue - Peek: " + doubleQueue.peek()); // Should print 3.7
        System.out.println("Double PriorityQueue - Remove: " + doubleQueue.remove()); // Should print 3.7
        System.out.println("Double PriorityQueue - Peek: " + doubleQueue.peek()); // Should print 2.5

        // Test PriorityQueue with String
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.add("apple");
        stringQueue.add("banana");
        stringQueue.add("cherry");
        stringQueue.add("date");
        System.out.println("String PriorityQueue - Peek: " + stringQueue.peek()); // Should print cherry
        System.out.println("String PriorityQueue - Remove: " + stringQueue.remove()); // Should print cherry
        System.out.println("String PriorityQueue - Peek: " + stringQueue.peek()); // Should print banana
    }
}
