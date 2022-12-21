package day11_Switch_Scanner;

/*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"
 */


public class Grade1 {

    public static void main(String[] args) {
        char ch= 'A';
        String result = "";
        switch(ch){
            case 'A': case'B': case'C': case'D':
                result="Passed";
                break;
            default:
                result="Failed";

        }

                System.out.println(result);


}








}
