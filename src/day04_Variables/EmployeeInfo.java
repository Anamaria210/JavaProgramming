package day04_Variables;
/*
6. Create a class employeeNamed EmployeeInfo. declare the following variables:
				1. employeeName (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExperience (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)
 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName = "Anamaria";
        int age = 32;
        char gender = 'F';
        String Company = "Cydeo" ;
        String JobTitle = "SDET";
        double yearsOfExperience = 3.5;
        int salary = 50_000;
        boolean isFullTime = true ;
        boolean isMarried = false ;
        String employeed = "Cydeo" ;
        String ssn = "(123)-456-789";

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("Company = " + Company);
        System.out.println("JobTitle = " + JobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeed = " + employeed);
        System.out.println("ssn = " + ssn);


    }
}
