package day10_NestedIf;

public class FieldTrip2 {
    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int numberOfGroup = 0;
        String TeacherInCharge = "";

        if (grade >= 1 && grade < 6) {

            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroup=3;
                TeacherInCharge="Ms. Smith";

            } else if (grade==2) {
                location="Zoo";
                numberOfGroup=7;
                TeacherInCharge="Mr.Lee";
            } else if (grade==3) {
                location="Aquarium";
                numberOfGroup=5;
                TeacherInCharge="Ms. Wilson";
            }else if (grade==4){
                location="Movie theater";
                numberOfGroup=2;
                TeacherInCharge="Ms. Reyes";
                System.out.println("location - "+ location+"\nnumber of groups - "+numberOfGroup+"\n teacher in charge " +TeacherInCharge);


        } else {
            System.out.println("Invalid grade");


        }
            System.out.println("location - "+ location+"\nnumber of groups - "+numberOfGroup+"\nteacher in charge- " +TeacherInCharge);
    }


}






    }



/*
8. Create a class called FieldTrip. Your school goes on a Field trip each year.
The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.
    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee
        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson
        grade - "4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes
        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela
        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */
