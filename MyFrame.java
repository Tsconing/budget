package budget;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button; // makes the button universal so we can use it outside of the constructor

    // create a constructor so that we can create an instance from this class
    MyFrame() {

        this.setTitle("Your NYC Budget"); // set the title of the this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the close operation of the frame to the exit button
                                                             // in top right

        this.setResizable(true); // set the frame to be resizable
        this.setVisible(true); // make the frame visible

        this.setSize(1000, 1000); // set the x,y size of the frame
        this.getContentPane().setBackground(Color.LIGHT_GRAY); // set the background color of the frame
        this.setLayout(null);

        button = new JButton();
        button.setBounds(0, 0, 100, 100);
        button.addActionListener(this);
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            System.out.println("Poop");

        }

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
