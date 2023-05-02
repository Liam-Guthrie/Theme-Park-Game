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

public class themepark{

    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JProgressBar progressBar;

    private int buttonPresses = 0;
    
    public themepark() {

    frame = new JFrame("Theme Park Game");
    frame.setSize(500, 500);

    button = new JButton("Press here to select your character");
    button.addActionListener(event -> this.CharacterMenu(event));

    }

    public void CharacterMenu(ActionEvent event){
        label = new JLabel("You Choose The Area");
        label = new JLabel("Park Employee");
        button = new JButton("Inspect Character");
        button.addActionListener(e -> this.CharacterInfo(e));
        button = new JButton("Play as Character");
        button.addActionListener(e -> this.StartGame(event));

    }

    public void CharacterInfo(ActionEvent event){
    frame = new JFrame("Park Employee");
    frame.setSize(500, 500);
    label = new JLabel("Character Bio");
    label = new JLabel("Character Stats");
    button = new JButton("Go Back to Menu");
    button.addActionListener(this.CharacterMenu(event));
    button = new JButton("Play as Character");
    button.addActionListener(this.StartGame(event));
    }

    public void StartGame(ActionEvent event){
        frame = newJFrame("The Game");
    }




















}