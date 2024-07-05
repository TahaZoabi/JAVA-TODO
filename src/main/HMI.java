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
                    TasksServices.addTaskInfo();
                    break;
                case "view":
                    TasksServices.viewTasks();
                    break;
                case "remove":
                    // delete task
                    break;
            }
        } while (!actions.equalsIgnoreCase("exit"));


    }


}
