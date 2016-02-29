import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by callumgreen on 26/02/2016.
 */
public class TaskList {

    private ArrayList<Task>taskList;

    public TaskList(){
        taskList = new ArrayList<Task>();
    }

    public Task getTask(int index){
        return taskList.get(index);
    }

    public boolean addNewTask(String taskDetail){
        return taskList.add(new Task(taskDetail, false, Priority.medium));
    }

    public ArrayList<Task> getTasksOfPriority(Priority priority){
        ArrayList<Task> returnList = new ArrayList<Task>();

        for (Task task : taskList) {
            if(task.getPriority().equals(priority)){
                returnList.add(task);
            }
        }
        return returnList;
    }

}
