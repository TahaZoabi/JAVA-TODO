package services;

import tools.Task;


import java.util.ArrayList;

import static main.HMI.SCANNER_INPUT;

public class TaskServices {

    public TaskServices(Task myTask) {
    }

    public static void addTaskInfo() {
        System.out.println("Enter Your Task!");
        String todo = SCANNER_INPUT.next();
        SCANNER_INPUT.nextLine();
        System.out.println("Enter Task Description:");
        String description = SCANNER_INPUT.nextLine();

        Task newTask = new Task();
        newTask.setToDo(todo.toLowerCase());
        newTask.setDescription(description.toLowerCase());
        newTask.setCompleted(false);

        addTask(newTask);
    }

    public static void addTask(Task task) {
        Task.getToDoTasks().add(task);
        System.out.println("Task added successfully.");
    }

    public static void viewTasks() {
        System.out.println("Tasks in ToDo list:");
        System.out.println("---------------------");
        ArrayList<Task> tasks = Task.getToDoTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        }
        else {
            int counter = 1;
            for (Task task : tasks) {
                System.out.println("Task Number " + counter);
                System.out.println("ToDo: " + task.getToDo());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Completed: " + task.isCompleted());
                System.out.println("---------------------");
                counter++;
            }
        }
    }

    public static void deleteTask() {
        System.out.println("Enter the Task Number to remove:");
        int taskNumber = SCANNER_INPUT.nextInt();

        ArrayList<Task> toDoTasks = Task.getToDoTasks();

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

}



