import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class ThemePark {
    // public static void main(String[] args) {

    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JProgressBar progressBar;

    private int buttonPresses = 0;

    public static void main(String[] args) {
        new ThemePark();
    }

    ThemePark() {

        frame = new JFrame("Theme Park Game");
        frame.setSize(500, 500);

        button = new JButton("Press here to select your character");
        button.addActionListener(event -> this.characterMenu(event));

    }

    public void characterMenu(ActionEvent event) {
        label = new JLabel("You Choose The Area");
        label = new JLabel("Park Employee");
        button = new JButton("Inspect Character");
        button.addActionListener(e -> this.characterInfo(e));
        button = new JButton("Play as Character");
        button.addActionListener(e -> this.startGame(e));

    }

    public void characterInfo(ActionEvent event) {
        frame = new JFrame("Park Employee");
        frame.setSize(500, 500);
        label = new JLabel("Character Bio");
        label = new JLabel("Character Stats");
        button = new JButton("Go Back to Menu");
        button.addActionListener(b -> this.characterMenu(b));
        button = new JButton("Play as Character");
        button.addActionListener(b -> this.startGame(b));
    }

    public void startGame(ActionEvent event) {
        frame = new JFrame("The Game");
        label = new JLabel("Which area do you want to start in?");
        button = new JButton("Area 1");
        button.addActionListener(a -> this.areaOne(a));
        button = new JButton("Area 2");
        button.addActionListener(a -> this.areaTwo(a));
        button = new JButton("Area 3");
        button.addActionListener(a -> this.areaThree(a));
        button = new JButton("Area 4");
        button.addActionListener(a -> this.areaFour(a));
    }

    public void areaOne(ActionEvent event) {
        frame = new JFrame("Area 1");
        label = new JLabel("Which attraction do you want to see?");
        button = new JButton("Attraction One");
        button.addActionListener(m -> this.attractionOneM(m));
        button = new JButton("Attraction 2");
        button.addActionListener(m -> this.attractionTwoM(m));
        button = new JButton("Attraction 3");
        button.addActionListener(m -> this.attractionThreeM(m));
    }

    public void areaTwo(ActionEvent event) {
        frame = new JFrame("Area 2");
    }

    public void areaThree(ActionEvent event) {
        frame = new JFrame("Area 3");
    }

    public void areaFour(ActionEvent event) {
        frame = new JFrame("Area 4");
    }

}
