package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourly rate , weeklyHours
        int HourlyRate = 65;
        int WeeklyHours =45;
        int NumberOfWeeks = 52;
        int Salary = HourlyRate * WeeklyHours * NumberOfWeeks;
      //  System.out.println(Salary);

        System.out.println("WeeklyHours =$" + WeeklyHours);
        System.out.println("HourlyRate = $" + HourlyRate);
        System.out.println("NumberOfWeeks = " + NumberOfWeeks);
        System.out.println("Salary = $" + Salary);





    }

}
