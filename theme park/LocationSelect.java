import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;


public class LocationSelect {
    public LocationSelect() {
        int c = 200;
        int lowDamage = 100;
        int okDamage = 500;
        JFrame frame;
        frame = new JFrame("The Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        int c = 200;
        int lowDamage = 100;
        int okDamage = 500;
        JFrame frame;
        frame = new JFrame("Area 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        //Make all this extra code in new class Area 2 (and others)
        JFrame frame = new JFrame("Area 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
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
        JFrame frame = new JFrame("Area 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        JFrame frame = new JFrame("Area 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    public void attractionOneM(ActionEvent event){
        new AttractionOne();
    }
    public void attractionOneH(ActionEvent event){
        new AttractionOne();
    }
    public void attractionOneE(ActionEvent event){
        new AttractionOne();
    }
    public void attractionOneA(ActionEvent event){
        new AttractionOne();
    }
    public void attractionTwoM(ActionEvent event){
        new AttractionTwo();
    }
    public void attractionTwoH(ActionEvent event){
        new AttractionTwo();
    }
    public void attractionTwoE(ActionEvent event){
        new AttractionTwo();
    }
    public void attractionTwoA(ActionEvent event){
        new AttractionTwo();
    }
    public void attractionThreeM(ActionEvent event){
        new AttractionThree();
    }
    public void attractionThreeH(ActionEvent event){
        new AttractionThree();
    }
    public void attractionThreeE(ActionEvent event){
        new AttractionThree();
    }
    public void attractionThreeA(ActionEvent event){
        new AttractionThree();
    }


}