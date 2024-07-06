package services;

import tools.Task;


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
        for (Task task : Task.getToDoTasks()) {
            System.out.println("ToDo: " + task.getToDo());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.getIsCompleted());
            System.out.println("---------------------");
        }
    }

    public static Task getDeleteTask() {
        System.out.println("What Task you want to remove?");
        String taskName = SCANNER_INPUT.next().toLowerCase();

        for (Task task : Task.getToDoTasks()) {
            if (task.getToDo().equals(taskName)) {
                return task;
            }
        }
        return null;
    }

    public static void deleteTask() {
        Task deleteTaskObj = getDeleteTask();
        Task.getToDoTasks().remove(deleteTaskObj);

    }
}
