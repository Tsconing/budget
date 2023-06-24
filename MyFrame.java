package budget;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class MyFrame extends JFrame {

    // create a constructor so that we can create an instance from this class
    MyFrame() {

        this.setTitle("Your NYC Budget"); // set the title of the this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the close operation of the frame to the exit button
                                                             // in top right

        this.setResizable(true); // set the frame to be resizable
        this.setVisible(true); // make the frame visible

        this.setSize(500, 500); // set the x,y size of the frame
        this.getContentPane().setBackground(Color.LIGHT_GRAY); // set the background color of the frame

    }

}
