package main;

import services.TasksServices;
import tools.Tasks;
import tools.ToDo;

import java.util.Scanner;

public class HMI {
    public static final Scanner SCANNER_INPUT = new Scanner(System.in);

    public static void start() {
        ToDo myToDo = new ToDo("My Tasks");
        TasksServices tasksServices = new TasksServices(myToDo);

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

        for (Tasks task : ToDo.getToDoTasks()) {
            System.out.println("ToDo: " + task.getToDo());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.isCompleted());
            System.out.println("---------------------");
        }
    }

}
