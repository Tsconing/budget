package budget;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Hello!" + "\n\nWhat is your name?");

        int userchoice = JOptionPane.showConfirmDialog(null,
                "Would you like to get started with your budget " + name + "?", "Please choose an option below",
                JOptionPane.YES_NO_OPTION);

        if (userchoice == 0) {
            JOptionPane.showMessageDialog(null, "Great! Let's Begin" + " \nHit ok to start ");

            String string_Pre_Tax_Salary = JOptionPane.showInputDialog(null, "What is your Pre-Tax Salary?");
            double Pre_Tax_Salary = Double.parseDouble(string_Pre_Tax_Salary);
            double post_tax_salary = 0;

            JOptionPane.showMessageDialog(null,
                    " your post tax salary will come out to be around...\n\n");

            if (Pre_Tax_Salary < 0) {
                JOptionPane.showMessageDialog(null, "Invalid salary");
                System.exit(0);

            } else if (Pre_Tax_Salary < 50000) {
                post_tax_salary = Pre_Tax_Salary * 0.72;
                JOptionPane.showMessageDialog(null,
                        "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                + post_tax_salary + "\n\nThis would make your monthly take home pay around $"
                                + post_tax_salary / 12,
                        "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

            } else if (Pre_Tax_Salary < 75000 && Pre_Tax_Salary >= 50000) {
                post_tax_salary = Pre_Tax_Salary * 0.68;
                JOptionPane.showMessageDialog(null,
                        "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                + post_tax_salary + "\n\nThis would make you monthly take home pay around $"
                                + post_tax_salary / 12,
                        "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

            } else if (Pre_Tax_Salary < 100000 && Pre_Tax_Salary >= 75000) {
                post_tax_salary = Pre_Tax_Salary * 0.65;
                JOptionPane.showMessageDialog(null,
                        "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                + post_tax_salary + "\n\nThis would make you monthly take home pay around $"
                                + post_tax_salary / 12,
                        "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

            } else if (Pre_Tax_Salary < 200000 && Pre_Tax_Salary >= 100000) {
                post_tax_salary = Pre_Tax_Salary * 0.62;
                JOptionPane.showMessageDialog(null,
                        "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                + post_tax_salary + "\n\nThis would make you monthly take home pay around $"
                                + post_tax_salary / 12,
                        "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

            } else {
                post_tax_salary = Pre_Tax_Salary * 0.60;
                JOptionPane.showMessageDialog(null,
                        "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                + post_tax_salary + "\n\nThis would make you monthly take home pay around $"
                                + post_tax_salary / 12,
                        "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);
            }

            JOptionPane.showMessageDialog(null,
                    "In theory your rent should be no more than 30% of your pre-tax salary. Which would put you around... \n\n$"
                            + Pre_Tax_Salary / 12 * 0.30 + " per month ",
                    "Expected Rent", JOptionPane.INFORMATION_MESSAGE);

            String string_Rent = JOptionPane.showInputDialog(null, "What is your monthly rent?");
            double Rent = Double.parseDouble(string_Rent);

            if (Rent > Pre_Tax_Salary / 12 * 0.30) {
                JOptionPane.showMessageDialog(null,
                        "Your rent is too high! \n\nYou should be spending no more than $"
                                + Pre_Tax_Salary / 12 * 0.30 + " per month on rent",
                        "Rent", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Your rent is within the recommended range! \n\nYou should be spending no more than $"
                                + Pre_Tax_Salary / 12 * 0.30 + " per month on rent",
                        "Rent", JOptionPane.INFORMATION_MESSAGE);
            }

            JOptionPane.showMessageDialog(null,
                    "We will assume transportation will probably be around $200 per month for subway and also account for potential uber/taxis charges",
                    "Expected Transportation", JOptionPane.INFORMATION_MESSAGE);
            Double Transportation = 200.0;

            int userchoice2 = JOptionPane.showConfirmDialog(null,
                    "Do you think you will cook at home more than you eat out? \n\nRespond 'yes' if you will cook at home more and 'no' if not",
                    "Expected Grocery Spending", JOptionPane.YES_NO_OPTION);
            Double Groceries = 0.0;

            if (userchoice2 == 0) {
                JOptionPane.showMessageDialog(null,
                        "You will probably spend around $400 per month on groceries and $200 for eating out",
                        "Grocery Spending", JOptionPane.INFORMATION_MESSAGE);
                Groceries = 600.0;

            } else {
                JOptionPane.showMessageDialog(null,
                        "You will probably spend around $300 per month on groceries and $400 for eating out",
                        "Grocery Spending", JOptionPane.INFORMATION_MESSAGE);
                Groceries = 700.0;
            }

            String studentLoans = JOptionPane.showInputDialog(null,
                    "Do you have any studnet loans? \n\nIf yes, respond with your monthly payment amount below... If no, respond with '0'");
            double Student_Loans = Double.parseDouble(studentLoans);

            Double monthly_expenses = Rent + Groceries + Transportation + Student_Loans;
            Double monthly_income = post_tax_salary / 12;

            JOptionPane.showMessageDialog(null,
                    "So far with these essential expenses, you are spending around $" + monthly_expenses
                            + " per month... \n\nLeaving you with around $" + (monthly_income - monthly_expenses)
                            + " excess money per month",
                    "Essential Expenses", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Goodbye " + name + "!");
            System.exit(0);
        }

        // JLabel label = new JLabel(); // creates an instance of the Jlabel class
        // label.setText("Salary"); // sets the text of the label to "Hello"
        // label.setHorizontalTextPosition(JLabel.CENTER); // sets the
        // horizontalposition of the text (LEFT, CENTER,
        // // RIGHT)
        // label.setVerticalTextPosition(JLabel.TOP); // sets the vertical position
        // oftext (TOP, CENTER, BOTTOM)
        // label.setForeground(Color.BLUE); // sets the foreground color of the text
        // label.setFont(new Font("Calibri", Font.PLAIN, 20)); // sets the font of the
        // text (font name, font style, font
        // // size)"));

        // JLabel label2 = new JLabel();
        // label2.setText("Necessities");
        // label2.setHorizontalTextPosition(JLabel.CENTER);
        // label2.setVerticalTextPosition(JLabel.BOTTOM);

        // JPanel greenPanel = new JPanel();
        // greenPanel.setBackground(Color.GREEN);
        // greenPanel.setBounds(0, 0, 200, 500);

        // JPanel redPanel = new JPanel();
        // redPanel.setBackground(Color.RED);
        // redPanel.setBounds(200, 0, 200, 500);

        MyFrame myFrame = new MyFrame(); // creates an instance of the MyFrame class (which extends JFrame)

        // // myFrame.add(label); // adds the label to the frame
        // // myFrame.add(label2); // adds the second label to the frame
        // myFrame.add(greenPanel);
        // greenPanel.add(label);
        // myFrame.add(redPanel);
        // redPanel.add(label2);

    }
}
