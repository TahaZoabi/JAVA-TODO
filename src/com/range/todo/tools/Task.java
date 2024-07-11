package com.range.todo.tools;

public class Task {
    private final String toDo;
    private final String description;
    private boolean completed;

    public Task(String toDo, String description) {
        this.toDo = toDo;
        this.description = description;
    }

    public String getToDo() {
        return toDo;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


}
