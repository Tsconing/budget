package budget;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button; // makes the button universal so we can use it outside of the constructor
    JButton calculateButton; // makes the calculateButton universal so we can use it in an action listener
    JButton exitButton;

    // create a constructor so that we can create an instance from this class
    MyFrame() {

        this.setTitle("Your NYC Budget at a Glance"); // set the title of the this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the close operation of the frame to the exit button
                                                             // in top right

        this.setResizable(true); // set the frame to be resizable

        this.setSize(1000, 1000); // set the x,y size of the frame
        this.getContentPane().setBackground(Color.LIGHT_GRAY); // set the background color of the frame

        // to set a frame with the flow layout we setLayout to new FlowLayout
        this.setLayout(new GridLayout(8, 2));

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        JButton exitButton = new JButton("exit");

        // Green Labels
        JLabel Pre_Tax_Salary = new JLabel("Pre-Tax Income");
        JLabel Post_Tax_Salary = new JLabel("Post-Tax Income");

        // Red Labels
        JLabel Rent = new JLabel("Rent");
        JLabel Groceries = new JLabel("Groceries");
        JLabel Student_Loans = new JLabel("Student Loans");
        JLabel Insurance_Miscellaneous = new JLabel("Insurance + Miscellaneous");
        JLabel Entertainment = new JLabel("Entertainment");

        // Totals
        JLabel Excess_money = new JLabel("Excess Money");

        this.add(Pre_Tax_Salary);
        this.add(Post_Tax_Salary);
        this.add(Rent);
        this.add(Groceries);
        this.add(Student_Loans);
        this.add(Insurance_Miscellaneous);
        this.add(Entertainment);
        this.add(Excess_money);

        JLabel Pre_Tax_Salary_Amount = new JLabel();
        JLabel Post_Tax_Salary_Amount = new JLabel();
        JLabel Rent_Amount = new JLabel();
        JLabel Groceries_Amount = new JLabel();
        JLabel Miscellaneous_Amount = new JLabel();
        JLabel Entertainment_Amount = new JLabel();
        JLabel Excess_Amount = new JLabel();

        this.add(Pre_Tax_Salary_Amount);
        this.add(Post_Tax_Salary_Amount);
        this.add(Rent_Amount);
        this.add(Groceries_Amount);
        this.add(Miscellaneous_Amount);
        this.add(Entertainment_Amount);
        this.add(Excess_Amount);

        this.setVisible(true); // make the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == calculateButton) {
            System.out.println("Poop");

        }
        if (e.getSource() == exitButton) {
            System.exit(0);

        }
    }

}
