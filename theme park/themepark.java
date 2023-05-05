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
    // public static void main(String[] args) {

    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JProgressBar progressBar;


    private int buttonPresses = 0;
    private int score = 0;
    int lowDamage = 0;
       int okDamage = 0;
       int points = 0;
       int c = 0;
    

    public static void main(String[] args) {
       // boolean randomEncounter = true;
       
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
        int c = 200;
        int lowDamage = 100;
        int okDamage = 500;


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
        button = new JButton("Attraction 1");
        button.addActionListener(m -> this.attractionOneM(m));
        button = new JButton("Attraction 2");
        button.addActionListener(m -> this.attractionTwoM(m));
        button = new JButton("Attraction 3");
        button.addActionListener(m -> this.attractionThreeM(m));
    }

    public void areaTwo(ActionEvent event) {
        frame = new JFrame("Area 2");
        label = new JLabel("Which attraction do you want to see?");
        button = new JButton("Attraction 1");
        button.addActionListener(h -> this.attractionOneH(h));
        button = new JButton("Attraction 2");
        button.addActionListener(h -> this.attractionTwoH(h));
        button = new JButton("Attraction 3");
        button.addActionListener(h -> this.attractionThreeH(h));
    }

    public void areaThree(ActionEvent event) {
        frame = new JFrame("Area 3");
        label = new JLabel("Which attraction do you want to see?");
        button = new JButton("Attraction 1");
        button.addActionListener(e -> this.attractionOneE(e));
        button = new JButton("Attraction 2");
        button.addActionListener(e -> this.attractionTwoE(e));
        button = new JButton("Attraction 3");
        button.addActionListener(e -> this.attractionThreeE(e));
    }

    public void areaFour(ActionEvent event) {
        frame = new JFrame("Area 4");
        label = new JLabel("Which attraction do you want to see?");
        button = new JButton("Attraction 1");
        button.addActionListener(a -> this.attractionOneA(a));
        button = new JButton("Attraction 2");
        button.addActionListener(a -> this.attractionTwoA(a));
        button = new JButton("Attraction 3");
        button.addActionListener(a -> this.attractionThreeA(a));
    }

    public void attractionOneM(ActionEvent event) {
        frame = new JFrame("Attraction One");
        boolean randomEncounter = true;
        while (randomEncounter == true){
            try (Scanner in = new Scanner("randomEncounter.txt")) {
                String output = in.next();
                label = new JLabel(output);
        }
        label = new JLabel("What do you do?");
        button = new JButton("1- Run away");
        button = new JButton("2- Engage in an anime battle");
        button = new JButton("3- Make peace"); 

    }

    }
    public void optionOne(ActionEvent event){
        boolean randomEncounter = false;
        points = points + 100;

    }

    public void optionTwo(ActionEvent event){
        int m = 300;
        m = (int) (Math.random() * 100 + 150);
        frame = new JFrame("Waiting...");
        label = new JLabel("You did" + m);
        if (m > 0){
            boolean randomEncounter = true;
        }
        else if (1 > m){
            boolean randomEncounter = false;
        }

    }

    public void optionThree(ActionEvent event){
        frame = new JFrame("Waiting...");
        label = new JLabel("Tap the button to try to make peace");
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        button = new JButton("Click me");
        button.addActionListener(u -> this.makePeace(u));
        frame.add(progressBar);
        frame.add(button);
        frame.setVisible(true);
        if (score == 100){
            try (Scanner in = new Scanner("randomEncounter.txt")) {
                String output = in.next();
                label = new JLabel("You made peace with" + output);
                points = points + 150;
            }
            boolean randomEncounter = false;
        }
    }

    private void makePeace(ActionEvent event) {
        this.score++;
        this.progressBar.setValue(this.score);


    }

    public void attractionTwoM(ActionEvent event) {
        frame = new JFrame("Attraction Two");
        try (Scanner in = new Scanner("randomEncounterElectricBoogaloo.txt")) {
            String output = in.next();
            label = new JLabel("You come across" + output);
            points = points + 150;
        }
        label = new JLabel("Tap the button to try to have more people join your party");
        progressBar = new JProgressBar(0, 150);
        progressBar.setStringPainted(true);
        button = new JButton("Click me");
        button.addActionListener(u -> this.makePeace(u));
        frame.add(progressBar);
        frame.add(button);
        frame.setVisible(true);
        if (score == 150){
            label = new JLabel("Your party is now stronger");
            
        }
    }

    public void attractionThreeM(ActionEvent event) {
        frame = new JFrame("Attraction Three");

    }

    public void attractionOneH(ActionEvent event) {
        frame = new JFrame("Attraction One");

    }

    public void attractionTwoH(ActionEvent event) {
        frame = new JFrame("Attraction Two");

    }

    public void attractionThreeH(ActionEvent event) {
        frame = new JFrame("Attraction Three");

    }

    public void attractionOneE(ActionEvent event) {
        frame = new JFrame("Attraction One");

    }

    public void attractionTwoE(ActionEvent event) {
        frame = new JFrame("Attraction Two");

    }

    public void attractionThreeE(ActionEvent event) {
        frame = new JFrame("Attraction Three");

    }

    public void attractionOneA(ActionEvent event) {
        frame = new JFrame("Attraction One");

    }

    public void attractionTwoA(ActionEvent event) {
        frame = new JFrame("Attraction Two");

    }

    public void attractionThreeA(ActionEvent event) {
        frame = new JFrame("Attraction Three");

    }


}
