package services;

import tools.Tasks;


import static main.HMI.SCANNER_INPUT;

public class TasksServices {

    public TasksServices(Tasks myTasks) {
    }

    public void addTaskInfo() {
        System.out.println("Enter Your Task!");
        String todo = SCANNER_INPUT.next();
        System.out.println("Enter Task Description:");
        String description = SCANNER_INPUT.next();

        Tasks newTask = new Tasks();
        newTask.setToDo(todo);
        newTask.setDescription(description);
        newTask.setCompleted(false);

        addTask(newTask);
    }

    public void addTask(Tasks task) {
        Tasks.getToDoTasks().add(task);
        System.out.println("Task added successfully.");
    }
}
