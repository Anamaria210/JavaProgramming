package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;

        if (score >= 0 && score <= 100) { //if score is valid
            if (score >= 60) {
                System.out.println("Pass"); //if student pass the exam
            } else { //otherwise fail exam

                System.out.println("Fail");

            }

        } else {// if the score is not value
            System.out.println("Invalid Score");


            System.out.println("------------------------");
            int age = 25;
            boolean hasId = false;

            if (hasId) {    //if the person has id
                if (age >= 21) { //if the person has 21-year-old
                    System.out.println("Eligible to buy alcohol");
                } else { //if the person is less 21-year-old
                    System.out.println("Not Eligible to buy alcohol");
                }
            } else { //if the person does not have id
                System.out.println("You must have id to buy alcohol");
            }

            System.out.println("---------------------------------");


            System.out.println("-------------------------------------------");

            int number = 4;

            // 1 <= number <= 7
            if(number >= 1 && number<= 7){ // if the number is a valid number (1~7)

                if(number == 1){
                    System.out.println("Monday");
                }else if(number == 2){
                    System.out.println("Tuesday");
                }else if(number == 3){
                    System.out.println("Wednesday");
                }else if(number == 4){
                    System.out.println("Thursday");
                }else if(number == 5){
                    System.out.println("Friday");
                }else if(number == 6){
                    System.out.println("Saturday");
                }else{
                    System.out.println("Sunday");
                }

            }else{ // if the number is not valid
                System.out.println("Invalid Number");
            }


        }


    }


}