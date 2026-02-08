package project;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();
		int choice;

		do {

			System.out.println("--- TO-DO APPLICATION ---\n");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Remove Task");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter task: ");
				String task = sc.nextLine().trim();
				tasks.add(task);
				System.out.println("Task added successfully");
				break;

			case 2:
				System.out.println("\nYour Task:");
				if (tasks.size() > 0) {
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println((i + 1) + ". " + tasks.get(i));
					}
				} else {
					System.out.println("No tasks available");
				}
				break;

			case 3:
				System.out.print("Enter task number to remove: ");
				int taskNum = sc.nextInt();
				if (taskNum > 0 && taskNum <= tasks.size()) {
					tasks.remove(taskNum - 1);
					System.out.println("Task removed successfully");
				} else if (tasks.size() == 0) {
					System.out.println("No task to remove");
				} else {
					System.out.println("Invalid task number");
				}
				break;

			case 4:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice Try again.");
			}
		} while (choice != 4);
	}
}