package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String FirstName = "Aaron" ;
        String lastName ="Daniel";
        String fullName = FirstName +" " + lastName;
        int age = 29;
        String jobTitle= "SDET";
        String CompanyName= "Apple Inc";
        double salary = 100000.58;

        System.out.println(fullName);
        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName +" is " + age+" years old");
        System.out.println(fullName + " is " +jobTitle +",works at " + CompanyName + " and "+ fullName+ " salary is $ " +salary);

    }
}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
 */
// Full name of the person is ____
//___is ___ years old
//Full name is jobTitle , works at companyName