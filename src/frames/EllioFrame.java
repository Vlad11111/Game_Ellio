package frames;

import panels.MainAnimationPanel;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

/**
 * Created by Hemant Saini on 29-05-2017.
 */
public class EllioFrame extends JFrame {

    private static final int WINDOW_WIDTH=800;
    private static final int WINDOW_HEIGHT=450;


    public EllioFrame(){

        setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(new MainAnimationPanel());
        pack();
        setVisible(true);

    }

}