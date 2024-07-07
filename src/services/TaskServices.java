package services;

import tools.Task;


import java.util.ArrayList;

import static main.HMI.SCANNER_INPUT;

public class TaskServices {

    private static final ArrayList<Task> TO_DO_TASKS = new ArrayList<>();

    public static ArrayList<Task> getToDoTasks() {
        return TO_DO_TASKS;
    }

    public TaskServices(Task myTask) {
    }

    public static void addTaskInfo() {
        System.out.println("Enter Your Task!");
        SCANNER_INPUT.nextLine();

        String todo;
        do {
            todo = SCANNER_INPUT.nextLine().trim();
            if (todo.isEmpty()) {
                System.out.println("Task cannot be empty. Please enter your task:");
            }
        } while (todo.isEmpty());

        System.out.println("Enter Task Description:");
        String description;
        do {
            description = SCANNER_INPUT.nextLine().trim();
            if (description.isEmpty()) {
                System.out.println("Description cannot be empty. Please enter task description:");
            }
        } while (description.isEmpty());

        Task newTask = new Task();
        newTask.setToDo(todo.toLowerCase());
        newTask.setDescription(description.toLowerCase());
        newTask.setCompleted(false);

        addTask(newTask);
    }


    public static void addTask(Task task) {
        TaskServices.getToDoTasks().add(task);
        System.out.println("Task added successfully.");
    }

    public static void viewTasks() {
        System.out.println("Tasks in ToDo list:\n" +
                "---------------------");
        ArrayList<Task> tasks = TaskServices.getToDoTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        }
        else {
            int counter = 1;
            for (Task task : tasks) {
                System.out.println("Task Number " + counter +
                        "\nToDo: " + task.getToDo() +
                        "\nDescription: " + task.getDescription() +
                        "\nCompleted: " + task.isCompleted() +
                        "\n---------------------");

                counter++;
            }
        }
    }

    public static void deleteTask() {
        System.out.println("Enter the Task Number to remove:");
        int taskNumber = SCANNER_INPUT.nextInt();

        ArrayList<Task> toDoTasks = TaskServices.getToDoTasks();

        if (taskNumber > 0 && taskNumber <= toDoTasks.size()) {
            toDoTasks.remove(taskNumber - 1);
            System.out.println("Task number " + taskNumber + " removed successfully.");
        }
        else {
            System.out.println("Invalid task number. No task removed.");
        }
    }

    public static void printActions() {
        System.out.println("How can I help you today? Please choose the action number:\n" +
                "1) Add a Task\n" +
                "2) View All Tasks\n" +
                "3) Complete a Task\n" +
                "4) Delete a Task\n" +
                "5) Exit");
    }

    // Method to safely read integer input with error handling
    public static int readIntInput() {
        while (!SCANNER_INPUT.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            SCANNER_INPUT.next();
        }
        return SCANNER_INPUT.nextInt();
    }

    public static void completeTask() {
        System.out.println("Enter the Task Number to complete:");
        int taskNumber = SCANNER_INPUT.nextInt();
        SCANNER_INPUT.nextLine();

        ArrayList<Task> toDoTasks = TaskServices.getToDoTasks();

        if (taskNumber > 0 && taskNumber <= toDoTasks.size()) {
            Task taskToComplete = toDoTasks.get(taskNumber - 1);
            taskToComplete.setCompleted(true);
            System.out.println("Task number " + taskNumber + " is now completed.");
        }
        else {
            System.out.println("Invalid task number. No task completed.");
        }
    }
}



