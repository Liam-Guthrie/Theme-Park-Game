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

public class SaveThePark {
    // Adds in different variables
    private int score;
    private Object progressBar;

    public SaveThePark() {
        JFrame frame;
        JButton button;
        JLabel label;
        JProgressBar progressBar;
        int buttonPresses = 0;
        int score = 0;
        int lowDamage = 0;
        int okDamage = 0;
        int points = 0;
        int c = 0;

        frame = new JFrame("Save the Park!");

        // Adds in a frame that can allow the user to select their move

        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        JLabel text = new JLabel("The big bad comes in.  It's up to you to save the park");
        JLabel choiceLabel = new JLabel("What do you do?");
        JButton retreatButton = new JButton("Retreat!");
        retreatButton.addActionListener(b -> endGame(b));
        JButton animeButton = new JButton("Start an anime battle and save the park!");
        animeButton.addActionListener(b -> animeFight(b));
        JButton peaceButton = new JButton("Make peace with the enemy and convince them to not take over the park!");
        peaceButton.addActionListener(b -> makePeaceandEndtheGame(b));
        frame.add(text);
        frame.add(choiceLabel);
        frame.add(retreatButton);
        frame.add(animeButton);
        frame.add(peaceButton);
        frame.setVisible(true);

    }

    public void endGame(ActionEvent event) {
        // Adds in an end screen for if the player fails
        JFrame frame;
        JLabel label;
        frame = new JFrame("The End");
        label = new JLabel("The park continues to be under strict rule");
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }

    public void animeFight(ActionEvent event) {
        // Code that allows the computer and player to fight each other
        JFrame frame;
        JLabel label;
        int c = 0;
        frame = new JFrame("Waiting...");
        int m = 300;
        int computerAttack = (int) (Math.random() * 100 + 200);
        c = computerAttack - c;
        m = (int) (Math.random() * 400 + 679);
        label = new JLabel("You did " + m);
        frame.add(label);
        if (0 > c) {
            endGame(event);
        }
        if (0 > m) {
            new SaveThePark();
        } else if (m > 0) {
            completeGame(event);
        }
    }

    public void makePeaceandEndtheGame(ActionEvent event) {
        // Adds in a click-able progress bar
        JFrame frame;
        JLabel label;
        int points = 0;
        int score = 0;
        frame = new JFrame("Waiting...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        JLabel peaceLabel = new JLabel("Tap the button to try to make peace");
        JProgressBar peaceProgressBar = new JProgressBar(0, 100);
        peaceProgressBar.setStringPainted(true);
        JButton peaceButton = new JButton("Click me");
        peaceButton.addActionListener(u -> this.makePeace(u));
        if (score == 100) {
            try (Scanner in = new Scanner("randomEncounter.txt")) {
                String output = in.next();
                label = new JLabel("You made peace with" + output);
                frame.add(label);
                points = points + 150;
            }
            boolean randomEncounter = false;
        }
        frame.add(peaceLabel);
        frame.add(peaceButton);
        frame.add(peaceProgressBar);
        frame.setVisible(true);
    }

    /**
     * @param event
     */
    public void completeGame(ActionEvent event) {
        // Adds in an end screen for if the player wins the game and saves the park
        JFrame frame;
        JLabel label;
        frame = new JFrame("Won");
        frame.setSize(500, 500);
        label = new JLabel("The park is now saved!");
        frame.add(frame);
        frame.add(label);
        frame.setVisible(true);

    }

    private void makePeace(ActionEvent event) {
        // Adds in a progress bar
        int score = 0;
        JProgressBar progressBar;
        this.score++;
        ((JProgressBar) this.progressBar).setValue(this.score);

    }
}
