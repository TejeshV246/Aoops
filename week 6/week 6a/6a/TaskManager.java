import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).setDescription(newDescription);
            System.out.println("Task updated at position " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            Task removedTask = taskList.remove(index);
            System.out.println("Task removed: " + removedTask.getDescription());
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println((i + 1) + ". " + taskList.get(i).getDescription());
            }
        }
    }
}
