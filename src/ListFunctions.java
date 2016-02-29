import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * Created by callumgreen on 25/02/2016.
 */
public class ListFunctions {

    private JList list;
    private DefaultListModel listModel;

    public ListFunctions(){
        listModel = new DefaultListModel();

    }


    public void addToList(Task task){
        listModel.addElement(task);

    }

    public JList<Task> getList() {
        return list;
    }

    public void setList(JList<Task> list) {
        this.list = list;
    }
}
