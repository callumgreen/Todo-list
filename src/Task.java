/**
 * Created by callumgreen on 26/02/2016.
 */
public class Task {

    private String task;
    private boolean complete;

    private Priority priority;


    public Task(String task, boolean complete, Priority priority){
        this.task = task;
        this.complete = complete;
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
