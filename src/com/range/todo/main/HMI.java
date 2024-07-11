package com.range.todo.main;

import com.range.todo.services.TaskServices;


import java.util.InputMismatchException;
import java.util.Scanner;

public class HMI {


    public static void start() {

        int action = 0;

        do {
            try {
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

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter task number.");
            }
        } while (action != 5);
    }


}
