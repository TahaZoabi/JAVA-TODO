package main;

import services.TasksServices;
import tools.Tasks;

import java.util.Scanner;

public class HMI {
    public static final Scanner SCANNER_INPUT = new Scanner(System.in);

    public static void start() {
        Tasks myTask = new Tasks();
        TasksServices tasksServices = new TasksServices(myTask);

        String actions;

        do {
            System.out.println("Would you like to add, view or remove a task?");
            actions = SCANNER_INPUT.next();

            switch (actions.toLowerCase()) {
                case "add":
                    tasksServices.addTaskInfo();
                    break;
                case "view":
                    //view task
                    break;
                case "remove":
                    // delete task
                    break;
            }
        } while (!actions.equalsIgnoreCase("exit"));

        viewTasks();
    }

    private static void viewTasks() {
        System.out.println("Tasks in ToDo list:");
        System.out.println("---------------------");
        for (Tasks task : Tasks.getToDoTasks()) {
            System.out.println("ToDo: " + task.getToDo());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.isCompleted());
            System.out.println("---------------------");
        }
    }

}
