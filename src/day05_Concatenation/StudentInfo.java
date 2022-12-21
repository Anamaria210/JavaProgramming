package day05_Concatenation;

/*
 2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone number (String) (###)-###-####
    			6. full time (boolean)
 */
public class StudentInfo {
    public static void main(String[] args) {
    String StudentName = "Ana";
    int age = 32;
    char gender = 'F';
    String SchoolName = "Cydeo";
    String PhoneNumber = "(020)-455-3555";
    boolean FullTime = true ;

        System.out.println("student_Name = " + StudentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_Name = " + SchoolName);
        System.out.println("phone_Number = " + PhoneNumber);
        System.out.println("full_" + "Time = " + FullTime);

    }

}
