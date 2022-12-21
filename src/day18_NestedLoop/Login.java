package day18_NestedLoop;
/*
        2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
        username: Cydeo
        password: WoodenSpoon
        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
        */

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user name");
        String userName=scan.next();
        System.out.println("Enter your password");
        String password=scan.next();

        if(userName.equals("Cydeo")&& password.equals("WoodenSpoon")){
            System.out.println("Login");
        }else{

        for (int i=0; i <3; i++) {
            System.out.println("Incorrect username or password");
            System.out.println("Enter your username");
            userName = scan.next();
            System.out.println("Enter your password");
            password = scan.next();

            if ((userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.out.println("Login");
                break;
            }

        }
                if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {

                    System.err.println("your account Locked,please contact support team");

                    scan.close();
                }







            }

        }


    }
