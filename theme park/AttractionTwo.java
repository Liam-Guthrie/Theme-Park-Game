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

public class AttractionTwo {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JProgressBar progressBar;

    private int buttonPresses = 0;
    public int score = 0;

    public AttractionTwo() {
        // Adds in a frame that allows the player to get more teammates
        JFrame frame;
        frame = new JFrame("Attraction Two");
        int points = 0;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        // Gets output from a text file
        try (Scanner in = new Scanner("randomEncounterElectricBoogaloo.txt")) {
            String output = in.next();
            label = new JLabel("You come across " + output);
            frame.add(label);
            points = points + 150;
        }
        // Adds in click-able progress bar
        JLabel partyLabel = new JLabel("Tap the button to try to have more people join your party");
        JProgressBar partyProgressBar = new JProgressBar(0, 150);
        partyProgressBar.setStringPainted(true);
        JButton partyButton = new JButton("Click me");
        partyButton.addActionListener(u -> this.makePeace(u));

        if (score == 150) {
            label = new JLabel("Your party is now stronger");

        }
        frame.add(partyLabel);
        frame.add(partyProgressBar);
        frame.add(partyButton);
        frame.setVisible(true);
        // frame.add(label);
    }

    private void makePeace(ActionEvent event) {
        this.score++;
        this.progressBar.setValue(this.score);

    }
}