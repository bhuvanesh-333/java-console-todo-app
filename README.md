# Java Console Todo App

This repository contains a simple Java console-based Todo application. It uses `ArrayList` to store tasks and a menu-driven loop to interact with the user through the terminal. Small console apps like this are common beginner projects for practicing Java basics.[web:15]

## Features

- Add todo tasks from user input.
- View all added tasks with numbering.
- Simple menu-driven interface using `Scanner`.
- Runs entirely in the console with no external dependencies.

## Code overview

Main class: `TodoApp`

- Uses `ArrayList<String>` to store tasks.
- Uses `Scanner` to read user input.
- Infinite `while (true)` loop to:
  - Show menu:
    - `1. Add task`
    - `2. View tasks`
    - `3. Exit`
  - Handle user choice with `if-else` statements.
- Exits the loop and closes the scanner when the user chooses option `3`.

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
public static void main(String[] args) {
ArrayList<String> todos = new ArrayList<>();
Scanner sc = new Scanner(System.in);

text
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

text

## How to run

1. Make sure Java (JDK 8 or later) is installed on your system. Basic Java setup guides show how to install and verify `java` and `javac` on the command line.[web:9]

2. Clone this repository:
git clone https://github.com/<your-username>/java-console-todo-app.git
cd java-console-todo-app

text

3. Save the code as `TodoApp.java` in the project root (or in a `src` folder if you prefer that structure).

4. Compile the program:
javac TodoApp.java

text

5. Run the program:
java TodoApp

text

6. Use the menu in the console to add and view your todo tasks.
