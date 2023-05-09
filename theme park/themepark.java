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
        frame.add(button);
        frame.setVisible(true);

    }

    public void characterMenu(ActionEvent event) {
        frame = new JFrame("You Choose The Area");
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
        frame = new JFrame("Park Employee");
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
        int c = 200;
        int lowDamage = 100;
        int okDamage = 500;


        frame = new JFrame("The Game");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        JLabel areaLabel = new JLabel("Which area do you want to start in?");
        JButton areaOneButton = new JButton("Area 1");
        areaOneButton.addActionListener(a -> this.areaOne(a));
        JButton areaTwoButton = new JButton("Area 2");
        areaTwoButton.addActionListener(a -> this.areaTwo(a));
        JButton areaThreeButton = new JButton("Area 3");
        areaThreeButton.addActionListener(a -> this.areaThree(a));
        JButton areaFourButton = new JButton("Area 4");
        areaFourButton.addActionListener(a -> this.areaFour(a));
        frame.add(areaLabel);
        frame.add(areaOneButton);
        frame.add(areaTwoButton);
        frame.add(areaThreeButton);
        frame.add(areaFourButton);
        frame.setVisible(true);
    }

    public void areaOne(ActionEvent event) {
        frame = new JFrame("Area 1");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        JLabel attractionLabel = new JLabel("Which attraction do you want to see?");
        JButton attractionOneButton = new JButton("Attraction 1");
        attractionOneButton.addActionListener(m -> this.attractionOneM(m));
        JButton attractionTwoButton = new JButton("Attraction 2");
        attractionTwoButton.addActionListener(m -> this.attractionTwoM(m));
        JButton attractionThreeButton = new JButton("Attraction 3");
        attractionThreeButton.addActionListener(m -> this.attractionThreeM(m));
        frame.add(attractionLabel);
        frame.add(attractionOneButton);
        frame.add(attractionTwoButton);
        frame.add(attractionThreeButton);
        frame.setVisible(true);
    }

    public void areaTwo(ActionEvent event) {
        frame = new JFrame("Area 2");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        JLabel attractionLabel = new JLabel("Which attraction do you want to see?");
        JButton attractionOneButton = new JButton("Attraction 1");
        attractionOneButton.addActionListener(h -> this.attractionOneH(h));
        JButton attractionTwoButton = new JButton("Attraction 2");
        attractionTwoButton.addActionListener(h -> this.attractionTwoH(h));
        JButton attractionThreeButton = new JButton("Attraction 3");
        attractionThreeButton.addActionListener(h -> this.attractionThreeH(h));
        frame.add(attractionLabel);
        frame.add(attractionOneButton);
        frame.add(attractionTwoButton);
        frame.add(attractionThreeButton);
        frame.setVisible(true);
    }

    public void areaThree(ActionEvent event) {
        frame = new JFrame("Area 3");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        JLabel attractionLabel = new JLabel("Which attraction do you want to see?");
        JButton attractionOneButton = new JButton("Attraction 1");
        attractionOneButton.addActionListener(e -> this.attractionOneE(e));
        JButton attractionTwoButton = new JButton("Attraction 2");
        attractionOneButton.addActionListener(e -> this.attractionTwoE(e));
        JButton attractionThreeButton = new JButton("Attraction 3");
        attractionThreeButton.addActionListener(e -> this.attractionThreeE(e));
        frame.add(attractionLabel);
        frame.add(attractionOneButton);
        frame.add(attractionTwoButton);
        frame.add(attractionThreeButton);
        frame.setVisible(true);
    }

    public void areaFour(ActionEvent event) {
        frame = new JFrame("Area 4");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        JLabel attractionLabel = new JLabel("Which attraction do you want to see?");
        JButton attractionOneButton = new JButton("Attraction 1");
        attractionOneButton.addActionListener(a -> this.attractionOneA(a));
        JButton attractionTwoButton = new JButton("Attraction 2");
        attractionTwoButton.addActionListener(a -> this.attractionTwoA(a));
        JButton attractionThreeButton = new JButton("Attraction 3");
        attractionThreeButton.addActionListener(a -> this.attractionThreeA(a));
        frame.add(attractionLabel);
        frame.add(attractionOneButton);
        frame.add(attractionTwoButton);
        frame.add(attractionThreeButton);
        frame.setVisible(true);
    }

    public void attractionOneM(ActionEvent event) {
        frame = new JFrame("Attraction One");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        boolean randomEncounter = true;
        while (randomEncounter == true){
            try (Scanner in = new Scanner("randomEncounter.txt")) {
                String output = in.next();
                label = new JLabel(output);
        }
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
        

    }
    //frame.add(button);
       // frame.add(label);
       frame.setVisible(true);

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
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);
        JLabel peaceLabel = new JLabel("Tap the button to try to make peace");
        JProgressBar peaceProgressBar = new JProgressBar(0, 100);
        peaceProgressBar.setStringPainted(true);
        JButton peaceButton = new JButton("Click me");
        peaceButton.addActionListener(u -> this.makePeace(u));
        if (score == 100){
            try (Scanner in = new Scanner("randomEncounter.txt")) {
                String output = in.next();
                label = new JLabel("You made peace with" + output);
                frame.add(label);
                points = points + 150;
            }
            boolean randomEncounter = false;
        }
        frame.add(peaceLabel);
        frame.add(peaceProgressBar);
        frame.setVisible(true);
    }

    private void makePeace(ActionEvent event) {
        this.score++;
        this.progressBar.setValue(this.score);


    }

    public void attractionTwoM(ActionEvent event) {
        frame = new JFrame("Attraction Two");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        try (Scanner in = new Scanner("randomEncounterElectricBoogaloo.txt")) {
            String output = in.next();
            label = new JLabel("You come across" + output);
            frame.add(label);
            points = points + 150;
        }
        JLabel partyLabel = new JLabel("Tap the button to try to have more people join your party");
        JProgressBar partyProgressBar = new JProgressBar(0, 150);
        partyProgressBar.setStringPainted(true);
        JButton partyButton = new JButton("Click me");
        partyButton.addActionListener(u -> this.makePeace(u));
        
        if (score == 150){
            label = new JLabel("Your party is now stronger");
            
        }
        frame.add(partyLabel);
        frame.add(partyProgressBar);
        frame.add(partyButton);
        frame.setVisible(true);
      //  frame.add(label);
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
