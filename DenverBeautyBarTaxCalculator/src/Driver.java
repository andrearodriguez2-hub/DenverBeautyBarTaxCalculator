import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * PSEUDOCODE

		1. Create a Scanner so the user can enter their income.

		2. Create an AverageWithholding object to calculate taxes.
		
		3. Display "Denver Beauty Bar Weekly Tax Calculator".
		
		4. Ask the user how much they made for the week.
		
		5. Check if the user entered a number.
		
		   IF the input is not a number
		       Display "Please enter a valid number."
		       Stop the calculation.
		   ELSE
		       Save the number as weeklyIncome.
		   END IF
		
		6. Check if the weekly income is valid.
		
		   IF weeklyIncome is less than 0
		       Display "Please enter a valid income."
		       Stop the calculation.
		   ELSE
		       Use calculateTax to figure out the taxes.
		
		       Save the tax amount as withholding.
		
		       Subtract withholding from weeklyIncome
		       to find how much money is left.
		
		       Display the weekly income.
		       Display the taxes to set aside.
		       Display the money left after taxes.
		
		7. Close the Scanner.
		 */
		
        Scanner input = new Scanner(System.in);

        AverageWithholding tax = new AverageWithholding();

        System.out.println("Denver Beauty Bar Weekly Tax Calculator");

        System.out.print("How much did you make this week? $");

        if (!input.hasNextDouble()) {
            System.out.println("Please enter a valid number.");
        } else {
            double weeklyIncome = input.nextDouble();

            if (weeklyIncome < 0) {
                System.out.println("Please enter a valid income.");
            } else {
            
                double withholding = tax.calculateTax(weeklyIncome);
                double remainingIncome = weeklyIncome - withholding;

                System.out.printf("Weekly income: $%.2f%n", weeklyIncome);
                System.out.printf("Taxes to set aside: $%.2f%n", withholding);
                System.out.printf("Money left after taxes: $%.2f%n", remainingIncome);
            }
        }

        input.close();
    }
	

}
