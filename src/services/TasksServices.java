package services;

import tools.Tasks;
import tools.ToDo;

import static main.HMI.SCANNER_INPUT;

public class TasksServices {

    Tasks myTask;
    ToDo myToDo;

    public TasksServices(ToDo myToDo) {
        this.myToDo = myToDo;
    }

    public ToDo getMyToDo() {
        return myToDo;
    }

    public void addTaskInfo() {
        System.out.println("Enter Your Task!");
        String todo = SCANNER_INPUT.next();
        System.out.println("Enter Task Description");
        String description = SCANNER_INPUT.next();
        this.myTask.setToDo(todo);
        this.myTask.setDescription(description);
        this.myTask.setCompleted(false);

    }

    public void addTask(Tasks task) {
        this.myToDo.getToDoTasks().add(task);
    }
}
