package tools;

import java.util.ArrayList;

public class Tasks {
    private String toDo;
    private String description;
    private boolean completed;

    private static final ArrayList<Tasks> TO_DO_TASKS = new ArrayList<>();

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public static ArrayList<Tasks> getToDoTasks() {
        return TO_DO_TASKS;
    }
}
