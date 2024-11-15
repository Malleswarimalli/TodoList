import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String title;
    private String status;

    public Task(String title, String status) {
        this.title = title;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
    }
}

public class todolist {
    private ArrayList<Task> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Display Live Tasks");
            System.out.println("4. Display Completed Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    displayLiveTasks();
                    break;
                case 4:
                    displayCompletedTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task status (Live/Completed): ");
        String status = scanner.nextLine();
        tasks.add(new Task(title, status));
        System.out.println("Task added successfully.");
    }

    private void updateTask() {
        System.out.print("Enter task title to update: ");
        String title = scanner.nextLine();
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                System.out.print("Enter new status (Live/Completed): ");
                String newStatus = scanner.nextLine();
                task.updateStatus(newStatus);
                System.out.println("Task updated successfully.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    private void displayLiveTasks() {
        System.out.println("Live Tasks:");
        for (Task task : tasks) {
            if (task.getStatus().equals("Live")) {
                System.out.println("- " + task.getTitle());
            }
        }
    }

    private void displayCompletedTasks() {
        System.out.println("Completed Tasks:");
        for (Task task : tasks) {
            if (task.getStatus().equals("Completed")) {
                System.out.println("- " + task.getTitle());
            }
        }
    }

    public static void main(String[] args) {
        todolist todoList = new todolist();
        todoList.start();
    }
}
