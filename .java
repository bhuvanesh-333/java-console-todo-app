import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear newline

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                todos.add(task);
                System.out.println("Task added.");
            } else if (choice == 2) {
                System.out.println("Your tasks:");
                for (int i = 0; i < todos.size(); i++) {
                    System.out.println((i + 1) + ". " + todos.get(i));
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
