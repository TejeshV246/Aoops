import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoListApplication {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("\nTo-Do List Application:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Consume the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = getValidIndex(scanner);
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    toDoList.updateTask(updateIndex - 1, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = getValidIndex(scanner);
                    toDoList.removeTask(removeIndex - 1);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    // Helper method to get a valid integer index
    private static int getValidIndex(Scanner scanner) {
        int index = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                if (index > 0) {
                    break;
                } else {
                    System.out.println("Invalid index. Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Consume the invalid input
            }
        }
        return index;
    }
}
