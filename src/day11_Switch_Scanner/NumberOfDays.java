package day11_Switch_Scanner;

/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12
			If(1~12){
			}else{
				Invalid
			}
 */
public class NumberOfDays {

    public static void main(String[] args) {
        int number=2;
        int year = 2000;
        if(number>=1&&number<=12){
            switch(number){
                case 2:
                    if(year%4==0) {
                        System.out.println("29 Days");
                    }else{
                        System.out.println("28 days");
                    }
                    break;
                case 4: case 6: case 9 : case 11:
                    System.out.println("30 Days");
                    break;
                default:
                    System.out.println("31 Days");}
        }else{
            System.out.println("invalid number");

        }








    }

}
