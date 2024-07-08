package com.range.todo.main;

import com.range.todo.services.TaskServices;


import java.util.InputMismatchException;
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

        } catch (InputMismatchException e) {
            System.out.println("Unknown Action: " + e.getMessage());
        }
    }


}