package budget;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("Your NYC Budget"); // set the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the close operation of the frame to the exit button
                                                              // in top right

        frame.setSize(500, 500); // set the x,y size of the frame
        frame.setVisible(true); // make the frame visible

    }

}
