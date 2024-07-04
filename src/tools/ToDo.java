package tools;

import java.util.ArrayList;

public class ToDo {
    private String name;

    private static ArrayList<Tasks> toDoTasks;

    public ToDo() {
        initObject();
    }

    private void initObject() {
        this.toDoTasks = new ArrayList<>();
    }

    public ToDo(String name) {
        this.name = name;
        initObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Tasks> getToDoTasks() {
        return toDoTasks;
    }


}
