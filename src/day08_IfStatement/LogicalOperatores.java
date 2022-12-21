package day08_IfStatement;

public class LogicalOperatores {
    public static void main(String[] args) {

        String name ="Arron";
        int age = 19;
        String Citizen = "UK";
        boolean illegible = age>= 18&& Citizen=="USA";
        //                  19>=18  && "UK == "USA"
         //                  true    &&       false ==> false
        System.out.println(name +" is eligible to vote "+ illegible);

        //-------------------------------------------------------------------
// Logical and operation
        String name2 = "Josh";
        int creditScore = 720 ;
        int age1 = 23;
        int income = 40000;

        boolean IsEligible = creditScore>= 700 && age1>=21&& income>=60000;
        System.out.println(name2+ " is eligible for loan " + IsEligible);
// in logical and operation both expressions need to be true in order to return true
        //---------------------------------------------------------------

// logical Or operation  ||
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible2 = age3>=18 &&(gender=='M'|| gender=='F') ;
        //                     21 >= 18   ('F' == 'M'    'F' == 'F'
    //                           true  &&        false   ||     true
        //                      true   &&        true  ==> result true

        System.out.println(name3+ " is eligible to register " + isEligible2);

        System.out.println("----------------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUsCitizen = false ;
        boolean IsEligible2 = countryOfBirth=="USA"|| marriedToUsCitizen==true;
        System.out.println(name4+ " is eligible to apply "+ IsEligible2);
        //in logical or operator only one expression need to be true in order to return true

        System.out.println("--------------------------------------");

        String student= "Anna";
        double gpa =3.5;
        int familyIncome= 100000;

        boolean IsEligible5 = gpa>= 3.5 || familyIncome<=60000;
        System.out.println(student+ " is eligible to scholarship " + IsEligible5);

        boolean result2= true ;
        System.out.println(result2);

        boolean result3 = ! result2;
        System.out.println(result3);


        System.out.println("------------------------------------------");
        int score = 85;
        boolean pass =score>= 60;
        boolean fail = !pass;

        System.out.println("pass = " + pass);
        System.out.println("fail = " + fail);




    }
}
