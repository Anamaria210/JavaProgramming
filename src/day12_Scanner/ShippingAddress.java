package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName= scan.nextLine();

        System.out.println("Enter your building number ");
        int building=scan.nextInt();
        scan.nextLine();
        System.out.println("enter you street name");
        String streetName=scan.nextLine();
        System.out.println("enter your city name");
        String city=scan.nextLine();
        System.out.println("enter State");
        String state=scan.nextLine();
        System.out.println("enter zip code");
        int zipCode= scan.nextInt();
        scan.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        scan.close();
    }
}
