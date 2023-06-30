package budget;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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

        this.setSize(1000, 1000); // set the x,y size of the frame
        this.getContentPane().setBackground(Color.LIGHT_GRAY); // set the background color of the frame

        // to set a frame with the flow layout we setLayout to new FlowLayout
        this.setLayout(new GridLayout(8, 2));

        JOptionPane introduction = new JOptionPane(, ALLBITS, ABORT, defaultCloseOperation, null, getComponentListeners(), accessibleContext)

    //     JButton calculateButton = new JButton("Calculate");
    //     JButton exit = new JButton("exit");



    //     JTextField TF_salary = new JTextField();
    //     JTextField Tf_rent = new JTextField();
    //     JTextField TF_




    //     JLabel rent = new JLabel("Enter your rent");

    //     // button = new JButton();
    //     // button.setText("This is the button");
    //     // button.setBounds(0, 0, 100, 100);
    //     // button.addActionListener(this);
    //     // this.add(button);
    //     this.add(button1);
    //     this.add(TF_salary);
    //     this.add(rent);

    //     this.setVisible(true); // make the frame visible
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            System.out.println("Poop");

        }
    }

}
