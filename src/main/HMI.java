package main;

import services.TaskServices;


import java.util.Scanner;

public class HMI {
    public static final Scanner SCANNER_INPUT = new Scanner(System.in);

    public static void start() {

        int action;

        try {
            do {
                TaskServices.printActions();
                action = TaskServices.readIntInput();

                switch (action) {
                    case 1:
                        TaskServices.addTaskInfo();
                        break;
                    case 2:
                        TaskServices.viewTasks();
                        break;
                    case 3:
                        TaskServices.completeTask();
                        break;
                    case 4:
                        TaskServices.deleteTask();
                        break;
                }
            } while (action != 5);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            SCANNER_INPUT.close();
        }
    }


}
