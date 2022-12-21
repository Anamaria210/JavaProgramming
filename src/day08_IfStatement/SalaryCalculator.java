package day08_IfStatement;
/*
3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)
				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */

public class SalaryCalculator {
    public static void main(String[] args) {


        int hourlyRate = 60,
         weeklyHours = 45;
        double stateTaxRate= 6.5,
                federalTaxRate=26.2;

       // ("-------------------------------------------")
        int SalaryBeforeTax = hourlyRate*weeklyHours*52;// salary is equal to one week salary * 52 weeks(year)
        double StateTax=SalaryBeforeTax*stateTaxRate/100;
        double federalTax = SalaryBeforeTax*federalTaxRate/100;
        double taxPaying = StateTax+federalTax;
        double netIncome = SalaryBeforeTax-taxPaying;
        System.out.println("Gross pay is "+ SalaryBeforeTax);
        System.out.println("StateTax = $ " + StateTax);
        System.out.println("federalTax = $ " + federalTax);
        System.out.println("taxPaying = $ " + taxPaying);
        System.out.println("netIncome = $ " + netIncome);




    }
}
