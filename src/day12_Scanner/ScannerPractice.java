package day12_Scanner;


//import java.util.*;// wild import:imports everything for package
import java.util.Scanner; //regular imports one class


public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int number = scan.nextInt();
        String result = "";// temporary value
        if (number >= 1 && number <= 7) {
            result = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednsday" : (number == 4) ?
                    "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";


        } else {
            result = "Invalid Number";
        }

        System.out.println(result);

        scan.close();

    }
    }


