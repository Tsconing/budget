package budget;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {

        JLabel label = new JLabel(); // creates an instance of the Jlabel class
        label.setText("Hello"); // sets the text of the label to "Hello"

        MyFrame myFrame = new MyFrame(); // creates an instance of the MyFrame class (which extends JFrame)
        myFrame.add(label); // adds the label to the frame

    }

}
