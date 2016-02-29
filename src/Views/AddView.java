package Views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by callumgreen on 26/02/2016.
 */
public class AddView {

        private static final int WIDTH = 600;
        private static final int HEIGHT = 400;

        public static void createAddFrame(){
            JFrame frame = new JFrame();
            JButton addEntry = new JButton("Add entry");
            JButton removeLastItem = new JButton("Remove last entry");
            JButton removeSpecific = new JButton("Remove specific entry");
            JButton close = new JButton("Exit");

            frame.setSize(WIDTH, HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("To-do List");

            JPanel panel = new JPanel();


            frame.add(panel);
            panel.add(addEntry, BorderLayout.NORTH);
            panel.add(removeLastItem, BorderLayout.NORTH);
            panel.add(removeSpecific, BorderLayout.NORTH);
            panel.add(close, BorderLayout.NORTH);

            frame.setVisible(true);

        }
}
