package tools;

public class Tasks {
    private String toDo;
    private String description;
    private boolean isCompleted;

    public Tasks(String toDo, String description, boolean isCompleted) {
        this.toDo = toDo;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public Tasks() {
    }

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

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}

