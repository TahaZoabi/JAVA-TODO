package services;

import tools.Tasks;
import tools.ToDo;


import static main.HMI.SCANNER_INPUT;

public class TasksServices {

    private final ToDo myToDo;

    public TasksServices(ToDo myToDo) {
        this.myToDo = myToDo;
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
        myToDo.getToDoTasks().add(task);
        System.out.println("Task added successfully.");
    }
}
