
public class AverageWithholding {
	
/*
 * PSEUDOCODE
1. Receive the weekly income from the Driver class.

2. Create a variable called taxRate to store the
   percentage based on the weekly income.

3. Check the weekly income to find the correct tax rate.

   IF weeklyIncome is less than 500
       Set taxRate to 0.10

   ELSE IF weeklyIncome is less than 1500
       Set taxRate to 0.15

   ELSE IF weeklyIncome is less than 2500
       Set taxRate to 0.20

   ELSE
       Set taxRate to 0.30

4. Multiply weeklyIncome by taxRate to calculate
   the withholding amount.

5. Return the withholding amount to the Driver class.
 */
	
	public double calculateTax(double weeklyIncome) {

        double taxRate;

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double withholding = weeklyIncome * taxRate;

        return withholding;
    }
	
}
