package services;

import tools.Tasks;
import tools.ToDo;

public class TasksServices {

    ToDo myToDo;

    public TasksServices(ToDo myToDo) {
        this.myToDo = myToDo;
    }

    public ToDo getMyToDo() {
        return myToDo;
    }

    public void addTask(Tasks todo) {

    }
}
