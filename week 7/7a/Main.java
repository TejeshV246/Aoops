// Main.java
public class Main {
    public static void main(String[] args) {
        // Test LinkedListStack with Integer
        Stack<Integer> intStack = new LinkedListStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("LinkedListStack - Peek: " + intStack.peek()); // Should print 3
        System.out.println("LinkedListStack - Pop: " + intStack.pop());  // Should print 3
        System.out.println("LinkedListStack - Is Empty: " + intStack.isEmpty()); // Should print false

        // Test ArrayStack with String
        Stack<String> strStack = new ArrayStack<>();
        strStack.push("Hello");
        strStack.push("World");
        strStack.push("!");
        System.out.println("ArrayStack - Peek: " + strStack.peek()); // Should print !
        System.out.println("ArrayStack - Pop: " + strStack.pop());  // Should print !
        System.out.println("ArrayStack - Is Empty: " + strStack.isEmpty()); // Should print false

        // Test ArrayStack with Character
        Stack<Character> charStack = new ArrayStack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        System.out.println("ArrayStack - Peek: " + charStack.peek()); // Should print C
        System.out.println("ArrayStack - Pop: " + charStack.pop());  // Should print C
        System.out.println("ArrayStack - Is Empty: " + charStack.isEmpty()); // Should print false
    }
}
