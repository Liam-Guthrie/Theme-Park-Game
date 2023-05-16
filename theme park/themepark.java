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

import java.io.FileReader;
import java.util.Scanner;

public class ThemePark {
    // adds in different variables that will be used in this main method

    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JProgressBar progressBar;

    private int buttonPresses = 0;
    public int score = 0;
    int lowDamage = 0;
    int okDamage = 0;
    int points = 0;
    int c = 0;
    //

    public static void main(String[] args) {
        // starts up the main method

        new ThemePark();
    }

    ThemePark() {

        // creates the title screen

        frame = new JFrame("Theme Park Game");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Press here to select your character");
        button.addActionListener(event -> this.characterMenu(event));
        frame.add(button);
        frame.setVisible(true);

    }

    public void characterMenu(ActionEvent event) {
        // creates an option to select the only character that is coded so far

        frame = new JFrame("You Choose The Area");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        label = new JLabel("Park Employee");
        JButton inspectButton = new JButton("Inspect Character");
        inspectButton.addActionListener(e -> this.characterInfo(e));
        JButton playButton = new JButton("Play as Character");
        playButton.addActionListener(e -> this.startGame(e));
        frame.add(playButton);
        frame.add(inspectButton);
        frame.add(label);
        frame.setVisible(true);

    }

    public void characterInfo(ActionEvent event) {
        //View stats and info about the character
        frame = new JFrame("Park Employee");
        c = 400;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        JLabel characterLabel = new JLabel("Character Bio");
        JLabel statsLabel = new JLabel("Character Stats");
        JButton menuButton = new JButton("Go Back to Menu");
        menuButton.addActionListener(b -> this.characterMenu(b));
        JButton playButton = new JButton("Play as Character");
        playButton.addActionListener(b -> this.startGame(b));
        frame.add(characterLabel);
        frame.add(statsLabel);
        frame.add(menuButton);
        frame.add(playButton);
        frame.setVisible(true);
    }

    public void startGame(ActionEvent event) {
        // go to the LocationSelect class
        new LocationSelect();
        
    }

    public void attractionOneM(ActionEvent event) {
        // go to the AttractionOne class
        new AttractionOne();
    }
    public void attractionTwoM(ActionEvent event) {
        // go to the AttractionTwo class

        new AttractionTwo();
    }

    public void attractionThreeM(ActionEvent event) {
        // go to the AttractionThree class

        new AttractionThree();

    }

    public void attractionOneH(ActionEvent event) {
        // go to the AttractionOne class

        new AttractionOne();

    }

    public void attractionTwoH(ActionEvent event) {
        // go to the AttractionTwo class

        new AttractionTwo();

    }

    public void attractionThreeH(ActionEvent event) {
        //go to the AttractionThree class 

        new AttractionThree();

    }

    public void attractionOneE(ActionEvent event) {
        // go to the AttractionOne class

        new AttractionOne();
    }

    public void attractionTwoE(ActionEvent event) {
        // go to the AttractionTwo class

        new AttractionTwo();

    }

    public void attractionThreeE(ActionEvent event) {
        //go to the AttractionThree class 

        new AttractionThree();

    }

    public void attractionOneA(ActionEvent event) {
        // go to the AttractionOne class

        new AttractionOne();

    }

    public void attractionTwoA(ActionEvent event) {
        // go to the AttractionTwo class

        new AttractionTwo();

    }

    public void attractionThreeA(ActionEvent event) {
        //go to the AttractionThree class 
        
        new AttractionThree();
    }

    public void saveThePark(ActionEvent event) {
        //go to the SaveThePark class

        new SaveThePark();
        
}
}
