package services;

import tools.Tasks;


import static main.HMI.SCANNER_INPUT;

public class TasksServices {

    public TasksServices(Tasks myTasks) {
    }

    public static void addTaskInfo() {
        System.out.println("Enter Your Task!");
        String todo = SCANNER_INPUT.next();
        SCANNER_INPUT.nextLine();
        System.out.println("Enter Task Description:");
        String description = SCANNER_INPUT.nextLine();

        Tasks newTask = new Tasks();
        newTask.setToDo(todo.toLowerCase());
        newTask.setDescription(description.toLowerCase());
        newTask.setCompleted(false);

        addTask(newTask);
    }

    public static void addTask(Tasks task) {
        Tasks.getToDoTasks().add(task);
        System.out.println("Task added successfully.");
    }

    public static void viewTasks() {
        System.out.println("Tasks in ToDo list:");
        System.out.println("---------------------");
        for (Tasks task : Tasks.getToDoTasks()) {
            System.out.println("ToDo: " + task.getToDo());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.getIsCompleted());
            System.out.println("---------------------");
        }
    }

    public static Tasks getDeleteTask() {
        System.out.println("What Task you want to remove?");
        String taskName = SCANNER_INPUT.next().toLowerCase();

        for (Tasks task : Tasks.getToDoTasks()) {
            if (task.getToDo().equals(taskName)) {
                return task;
            }
        }
        return null;
    }

    public static void deleteTask() {
        Tasks deleteTaskObj = getDeleteTask();
        Tasks.getToDoTasks().remove(deleteTaskObj);

    }
}
