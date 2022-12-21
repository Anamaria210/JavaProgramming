package day15_FoorLoopString;
/*
3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
 */
public class FormatFullName {
    public static void main(String[] args) {
       String firstName = "cyDEo",
              lastName = "SCHOOL";
      String result= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
               //C
        System.out.println(result);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(lastName);
        String fullName= result+" "+lastName;
        System.out.println(fullName);


    }
}
