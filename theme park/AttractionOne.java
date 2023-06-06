import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.FileReader;
import javax.swing.JLabel;
import java.util.Scanner;
import javax.swing.JProgressBar;
import java.awt.event.ActionEvent;

public class AttractionOne {

    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JProgressBar progressBar;
    public int score = 0;

    public AttractionOne() {
        boolean randomEncounter = true;
        // while (randomEncounter == true){
        JFrame frame;
        frame = new JFrame("Attraction One");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        // Gets output from text file

        try (Scanner in = new Scanner(new FileReader("randomEncounter.txt"))) {
            String output = in.nextLine();
            label = new JLabel(output);
            frame.add(label);
        } catch (Exception E) {
            System.out.println("File not found");
        }
        // Gives user battle options
        JLabel choiceLabel = new JLabel("What do you do?");
        JButton runButton = new JButton("1- Run away");
        runButton.addActionListener(g -> optionOne(g));
        JButton animeButton = new JButton("2- Engage in an anime battle");
        animeButton.addActionListener(g -> optionTwo(g));
        JButton peaceButton = new JButton("3- Make peace");
        peaceButton.addActionListener(g -> optionThree(g));
        frame.add(choiceLabel);
        frame.add(runButton);
        frame.add(animeButton);
        frame.add(peaceButton);
        frame.setVisible(true);

        // }
        // frame.add(button);
        // frame.add(label);
        frame.setVisible(true);

    }

    public void optionOne(ActionEvent event) {
        // Ends the battle
        int points = 0;
        boolean randomEncounter = false;
        points = points + 100;

    }

    public void optionTwo(ActionEvent event) {
        // Player and computer fight code
        frame = new JFrame("Waiting...");
        frame.setSize(500, 500);
        int m = 300;
        int c = 0;
        int computerAttack = (int) (Math.random() * 100 + 200);
        c = computerAttack - c;
        m = (int) (Math.random() * 300 + 678);
        label = new JLabel("You did" + m);
        frame.add(label);
        frame.setVisible(true);
        if (1 > c) {
            endGame(event);
        }
        if (0 > m) {
            new AttractionOne();
        } else if (m > 0) {
            new SaveThePark();
        }

    }

    public void optionThree(ActionEvent event) {
        // Allows the user to click a progress bar that will make the random encounter
        // friendly
        frame = new JFrame("Waiting...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        int points = 0;
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

    private void makePeace(ActionEvent event) {
        this.score++;
        this.progressBar.setValue(this.score);

    }

    public void endGame(ActionEvent event) {
        JFrame frame;
        JLabel label;
        frame = new JFrame("The End");
        label = new JLabel("The park continues to be under strict rule");
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }

}
