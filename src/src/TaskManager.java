import java.util.Scanner;

public class Main {

    static TaskManager manager = new TaskManager();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    manager.viewTasks();
                    System.out.print("Enter task number to mark complete: ");
                    int index = scanner.nextInt() - 1;
                    manager.completeTask(index);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
