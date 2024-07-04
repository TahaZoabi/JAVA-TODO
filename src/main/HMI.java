package main;

import java.util.Scanner;

public class HMI {
    private static final Scanner SCANNER_INPUT = new Scanner(System.in);

    public static void start() {
        String actions;

        do {
            System.out.println("Would you like to add, view or remove a task?");
            actions = SCANNER_INPUT.next();

            switch (actions) {
                case "add":
                    // add task
                    break;
                case "view":
                    //view task
                    break;
                case "remove":
                    // delete task
                    break;
            }
        } while (!actions.equalsIgnoreCase("exit"));
    }
}
