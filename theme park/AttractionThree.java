import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.FileReader;
import javax.swing.JLabel;
import java.util.Scanner;
import javax.swing.JProgressBar;
import java.awt.event.ActionEvent;

public class AttractionThree{
    public AttractionThree(){
        JFrame frame;
        JLabel label;
        frame = new JFrame("Attraction Three");
        label = new JLabel("You rode on a rollercoaster.  Weeee!!!");
        frame.add(frame);
        frame.add(label);
        frame.setVisible(true);
    }
}