package budget;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {

        public static void main(String[] args) {

                String name = JOptionPane.showInputDialog(null, "Hello!" + "\n\nWhat is your name?");

                int userchoice = JOptionPane.showConfirmDialog(null,
                                "Would you like to get started with your budget " + name + "?",
                                "Please choose an option below",
                                JOptionPane.YES_NO_OPTION);

                if (userchoice == 0) {
                        JOptionPane.showMessageDialog(null, "Great! Let's Begin" + " \nHit ok to start ");

                        String string_Pre_Tax_Salary = JOptionPane.showInputDialog(null,
                                        "What is your Pre-Tax Salary?");
                        double Pre_Tax_Salary = Double.parseDouble(string_Pre_Tax_Salary);
                        double post_tax_salary = 0;

                        if (Pre_Tax_Salary < 0) {
                                JOptionPane.showMessageDialog(null, "Invalid salary");
                                System.exit(0);

                        } else if (Pre_Tax_Salary < 50000) {
                                post_tax_salary = Pre_Tax_Salary * 0.72;
                                JOptionPane.showMessageDialog(null,
                                                "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                                + post_tax_salary
                                                                + "\n\nThis would make your monthly take home pay around $"
                                                                + post_tax_salary / 12,
                                                "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

                        } else if (Pre_Tax_Salary < 75000 && Pre_Tax_Salary >= 50000) {
                                post_tax_salary = Pre_Tax_Salary * 0.68;
                                JOptionPane.showMessageDialog(null,
                                                "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                                + post_tax_salary
                                                                + "\n\nThis would make you monthly take home pay around $"
                                                                + post_tax_salary / 12,
                                                "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

                        } else if (Pre_Tax_Salary < 100000 && Pre_Tax_Salary >= 75000) {
                                post_tax_salary = Pre_Tax_Salary * 0.65;
                                JOptionPane.showMessageDialog(null,
                                                "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                                + post_tax_salary
                                                                + "\n\nThis would make you monthly take home pay around $"
                                                                + post_tax_salary / 12,
                                                "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

                        } else if (Pre_Tax_Salary < 200000 && Pre_Tax_Salary >= 100000) {
                                post_tax_salary = Pre_Tax_Salary * 0.62;
                                JOptionPane.showMessageDialog(null,
                                                "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                                + post_tax_salary
                                                                + "\n\nThis would make you monthly take home pay around $"
                                                                + post_tax_salary / 12,
                                                "Post Tax Salary", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                                post_tax_salary = Pre_Tax_Salary * 0.60;
                                JOptionPane.showMessageDialog(null,
                                                "Based on last years taxes for the NYC area, your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                                + post_tax_salary
                                                                + "\n\nThis would make you monthly take home pay around $"
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
                                        "Do you have any student loans? \n\nIf yes, respond with your monthly payment amount below... If no, respond with '0'");
                        double Student_Loans = Double.parseDouble(studentLoans);

                        Double monthly_expenses = Rent + Groceries + Transportation + Student_Loans;
                        Double monthly_income = post_tax_salary / 12;

                        JOptionPane.showMessageDialog(null,
                                        "So far with these essential expenses, you are spending around $"
                                                        + monthly_expenses
                                                        + " per month... \n\nLeaving you with around $"
                                                        + (monthly_income - monthly_expenses)
                                                        + " excess money per month",
                                        "Essential Expenses", JOptionPane.INFORMATION_MESSAGE);

                        JOptionPane.showMessageDialog(null,
                                        "Now we have to take into account things like insurance, entertainment, etc..."
                                                        + "\n\nWe will group health insurance and renters insurance together and call it $120 per month to be cautious :).",
                                        "Expected Insurance", JOptionPane.INFORMATION_MESSAGE);
                        Double Insurance = 120.0;

                        JOptionPane.showMessageDialog(null,
                                        "Now this is the hard part... \n\nMiscellanneous and entertainment expenses can vary greatly from person to person.\n\nLet's budget $100 per month for miscellaneous things like toilet paper, soap, facewash, etc.",
                                        "Expected Miscellanneous Expenses", JOptionPane.INFORMATION_MESSAGE);
                        Double Miscellanneous = 100.0;

                        String Entertainment = JOptionPane.showInputDialog(null,
                                        "How much do you spend on entertainment such as Netflix, Spotify, etc. per month?",
                                        "Expected Entertainment Expenses", JOptionPane.INFORMATION_MESSAGE);
                        Double Entertainment_Expenses = Double.parseDouble(Entertainment);

                        String Going_out = JOptionPane.showInputDialog(null,
                                        "How much do you spend on going out per month?",
                                        "Expected Late Night Expenses", JOptionPane.INFORMATION_MESSAGE);
                        Double Going_Out = Double.parseDouble(Going_out);

                        String Other_expenses = JOptionPane.showInputDialog(null,
                                        "Do you think we missed anything?\n\nIf yes, respond with any other expenses you can think of below.",
                                        "Expected Additional Expenses", JOptionPane.INFORMATION_MESSAGE);
                        Double Other_Expenses = Double.parseDouble(Other_expenses);

                        Double total_expenses = monthly_expenses + Insurance + Miscellanneous + Entertainment_Expenses
                                        + Going_Out
                                        + Other_Expenses;

                        JOptionPane.showMessageDialog(null,
                                        "Now we can calculate you total monthly expenses!\n\n Taking into account these expenses, you will be spending around $"
                                                        + total_expenses
                                                        + " per month \n\nWhich will leave you with around $"
                                                        + ((post_tax_salary / 12) - total_expenses) + " per month.",
                                        "Final Budget", JOptionPane.INFORMATION_MESSAGE);

                        // create little spreadsheet summary of income vs expenses

                        JFrame myFrame = new JFrame(); // creates an instance of the MyFrame class (which extends
                                                       // JFrame)

                        Create_Frame(myFrame); // calls the Create_Frame method to build a grid that we can add jlabels
                                               // into

                        JButton calculateButton = new JButton("Calculate");
                        calculateButton.addActionListener((ActionListener) myFrame);

                        JButton exitButton = new JButton("exit");

                        // Green Labels
                        JLabel Pre_Tax_Salary_Label = new JLabel("Pre-Tax Income");
                        JLabel Post_Tax_Salary_Label = new JLabel("Post-Tax Income");

                        // Red Labels
                        JLabel Rent_Label = new JLabel("Rent");
                        JLabel Groceries_Label = new JLabel("Groceries");
                        JLabel Student_Loans_Label = new JLabel("Student Loans");
                        JLabel Insurance_Miscellaneous_Label = new JLabel("Insurance + Miscellaneous");
                        JLabel Entertainment_Label = new JLabel("Entertainment");

                        // Totals
                        JLabel Excess_money_Label = new JLabel("Excess Money");

                        MyFrame.add(Pre_Tax_Salary_Label);
                        myFrame.add(Post_Tax_Salary);
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

                        String Rent_Amount = ("$" + Rent);
                        JLabel Pre_Tax_Salary_Amount = new JLabel("$" + Pre_Tax_Salary);
                        JLabel Post_Tax_Salary_Amount = new JLabel("$" + post_tax_salary);
                        JLabel Groceries_Amount = new JLabel("$" + Groceries);
                        JLabel Miscellaneous_Amount = new JLabel("$" + Insurance + Miscellanneous);
                        JLabel Entertainment_Amount = new JLabel("$" + Entertainment + Going_Out);
                        JLabel Excess_Amount = new JLabel("$" + ((post_tax_salary / 12) - total_expenses));

                } else {
                        JOptionPane.showMessageDialog(null, "Goodbye " + name + "!");
                        System.exit(0);
                }

                // JPanel greenPanel = new JPanel();
                // greenPanel.setBackground(Color.GREEN);
                // greenPanel.setBounds(0, 0, 200, 500);

                // JPanel redPanel = new JPanel();
                // redPanel.setBackground(Color.RED);
                // redPanel.setBounds(200, 0, 200, 500);

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

                // // myFrame.add(label); // adds the label to the frame
                // // myFrame.add(label2); // adds the second label to the frame
                // myFrame.add(greenPanel);
                // greenPanel.add(label);
                // myFrame.add(redPanel);
                // redPanel.add(label2);

        }

        public static void Create_Frame(JFrame frame) {
                frame.setTitle("Your NYC Budget at a Glance"); // set the title of the this
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the close operation of the frame to the
                                                                      // exit button
                                                                      // in top right

                frame.setResizable(true); // set the frame to be resizable

                frame.setSize(1000, 1000); // set the x,y size of the frame
                frame.getContentPane().setBackground(Color.LIGHT_GRAY); // set the background color of the frame

                // to set a frame with the flow layout we setLayout to new FlowLayout
                frame.setLayout(new GridLayout(8, 2));

        }

}
