package budget;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class budget2 {

        public static void main(String[] args) {
                System.out.println("Welcom to NYC!... Let's calculate a budget for you!");

                System.out.println(" ");

                Scanner input = new Scanner(System.in);

                System.out.print("Enter your appproximate salary: ");

                double pre_tax_salary = input.nextInt();
                double post_tax_salary = 0;

                if (pre_tax_salary < 0) {
                        System.out.println("Invalid salary");

                        System.exit(0);
                } else if (pre_tax_salary < 50000) {
                        post_tax_salary = pre_tax_salary * 0.72;
                        System.out.println(
                                        "Your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                        + post_tax_salary);

                        System.out.println(" ");

                        System.out.println("This would make you monthly take home pay around $" + post_tax_salary / 12);

                } else if (pre_tax_salary < 75000 && pre_tax_salary >= 50000) {
                        post_tax_salary = pre_tax_salary * 0.68;
                        System.out.println(
                                        "Your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                        + post_tax_salary);

                        System.out.println(" ");

                        System.out.println("This would make you monthly take home pay around $" + post_tax_salary / 12);

                } else if (pre_tax_salary < 100000 && pre_tax_salary >= 75000) {
                        post_tax_salary = pre_tax_salary * 0.65;
                        System.out.println(
                                        "Your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                        + post_tax_salary);

                        System.out.println(" ");

                        System.out.println("This would make you monthly take home pay around $" + post_tax_salary / 12);

                } else if (pre_tax_salary < 200000 && pre_tax_salary >= 100000) {
                        post_tax_salary = pre_tax_salary * 0.62;
                        System.out.println(
                                        "Your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                        + post_tax_salary);

                        System.out.println(" ");

                        System.out.println("This would make you monthly take home pay around $" + post_tax_salary / 12);
                } else {
                        post_tax_salary = pre_tax_salary * 0.60;
                        System.out.println(
                                        "Your post tax salary without taking into account pretax withdrawals, such as retirement, is: $"
                                                        + post_tax_salary);

                        System.out.println(" ");

                        System.out.println("This would make you monthly take home pay around $" + post_tax_salary / 12);
                }
                System.out.println(" ");

                System.out.println("Now that we know you're post tax salary, let's calculate your budget!");

                System.out.println(" ");

                System.out.println(
                                "In theory, your rent should be no more than 30% of your pre tax salary. Which would put you around $"
                                                + pre_tax_salary / 12 * 0.30 + " per month.");

                System.out.println(" ");

                System.out.print("Enter what your rent is per month, including utilities: $");

                double rent = input.nextDouble();

                input.nextLine();

                System.out.println(" ");

                if (rent > pre_tax_salary / 12 * 0.30) {
                        System.out.println("You are spending too much on rent!");
                } else {
                        System.out.println("You are spending a reasonable amount on rent!");
                }

                System.out.println(" ");

                System.out.println(
                                "Transportation will probably be around $200 per month for subway and uber/taxi charges.");

                System.out.println(" ");

                System.out.println(
                                "Do you think you will eat out more or cook at home more?... Respond below with which option you will do more of 'cook' or 'eat out'");

                System.out.println(" ");

                String food = input.nextLine();

                Double groceries = 0.0;

                if (food.equals("cook")) {
                        groceries = 600.0;
                        System.out.println(
                                        "You will probably spend around $400 per month on groceries and $200 for eating out.");
                } else {
                        groceries = 700.0;
                        System.out.println(
                                        "You will probably spend around $400 per month on eating out and $300 on groceries .");
                }

                System.out.println(" ");

                System.out.print(
                                "Do you have any student loans?... If yes, respond with your monthly payment amount, if no, respond with 0 :");

                Double student_loans = input.nextDouble();

                System.out.println(" ");

                System.out.println("So far with these essential expenses, you are spending around $"
                                + (rent + groceries + student_loans) + " per month." + " Leaving you with around $"
                                + (post_tax_salary / 12 - (rent + groceries + student_loans))
                                + " excess money per month.");

                System.out.println(" ");
                System.out.println("Now we have to take into account things like insurance, entertainment, etc...");

                System.out.println(
                                "We will group health insurance and renters insurance together and call it $120 per month to be cautious.");
                Double insurance = 120.0;

                System.out.println(" ");
                System.out.println("Now this is the hard part, miscallenous and entertainment expenses....");
                System.out.println(
                                "Let's budget $100 for miscellaneous things like toilet paper, soap, facewash, etc.");
                Double miscellaneous = 100.0;

                System.out.println(" ");
                System.out.println("How much do you spend on entertainment such as Netflix, Spotify, etc. per month?");

                Double entertainment = input.nextDouble();
                input.nextLine();

                System.out.println("");

                System.out.println("How much do you spend on going out per month?");
                Double going_out = input.nextDouble();
                input.nextLine();

                System.out.println("");
                System.out.println(
                                "Do you think we missed anything?... If yes, respond with any other expenses you can think of below");
                Double other_expenses = input.nextDouble();

                miscellaneous = entertainment + miscellaneous + going_out + other_expenses;

                System.out.println(" ");

                System.out.println("Now we can calculate your total monthly expenses!");
                System.out.println("Taking into account these expenses, you will be spending around $"
                                + (rent + groceries + student_loans + insurance + miscellaneous) + " per month.");

                System.out.println(" ");
                System.out.println("Which will leave you with around $"
                                + (post_tax_salary / 12
                                                - (rent + groceries + student_loans + insurance + miscellaneous))
                                + " per month.");
        }

}
