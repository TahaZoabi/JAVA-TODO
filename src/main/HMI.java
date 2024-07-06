package main;

import services.TaskServices;
import tools.Task;

import java.util.Scanner;

public class HMI {
    public static final Scanner SCANNER_INPUT = new Scanner(System.in);

    public static void start() {
        Task myTask = new Task();
        TaskServices taskServices = new TaskServices(myTask);

        String actions;

        do {
            System.out.println("Would you like to add, view or remove a task?");
            actions = SCANNER_INPUT.next();

            switch (actions.toLowerCase()) {
                case "add":
                    TaskServices.addTaskInfo();
                    break;
                case "view":
                    TaskServices.viewTasks();
                    break;
                case "remove":
                    TaskServices.deleteTask();
                    break;
            }
        } while (!actions.equalsIgnoreCase("exit"));


    }


}
