package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {


      /*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"
 */

        char grade= 'D';

        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case'D' :
                System.out.println("Passed ");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("Invalid");


        }

    }
}
