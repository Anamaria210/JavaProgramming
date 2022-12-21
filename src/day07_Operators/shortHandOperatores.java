package day07_Operators;

public class shortHandOperatores {
    public static void main(String[] args) {

        // assignment : =
        int number = 100;
        System.out.println("number = " + number); // 100
        number = 200;

        System.out.println("number = " + number);


        String word = "Java Programming ";
        System.out.println("word = " + word); // its going to print Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word); // Its going to print Wooden Spoon

        word = "Cydeo ";
        System.out.println("word = " + word); //will print Cydeo because we change the data in variable

       // word = 123; We cannot assign numbers

        //Addition Assignment
         int x =100;

        System.out.println("x = " + x);
        System.out.println(x +200);
       // x= x+200;
        x+=200;
        System.out.println("x = " + x);
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);


        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);


        double avaibleBalance = 1000.50;
        avaibleBalance +=300;
        System.out.println("avaibleBalance = " + avaibleBalance);

        System.out.println("---------------------------------------");
        // Withdraw 500 £
        System.out.println("avaibleBalance = " + avaibleBalance);
        avaibleBalance -=500; // avaible balancce = 1300.50-500
        System.out.println("avaibleBalance = " + avaibleBalance);

        //Withdraw 200 and after depositing 400

        avaibleBalance-=200;
        System.out.println("avaibleBalance = " + avaibleBalance);
        avaibleBalance+=400;
        System.out.println("avaibleBalance = " + avaibleBalance);


        System.out.println("--------------------------------------");
        // Multiplication
        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary*=2;
        System.out.println("salary = " + salary);


        double doge = 0.00000001;
        doge*=1000000;
        System.out.println("doge = " + doge);


        System.out.println("......................................");
        double num2= 25000;
           num2/=2;
        System.out.println("num2 = " + num2);
        System.out.println("-----------------------------");
        //Reminder
        double num3 =100;
        num3 %=3;
        System.out.println("num3 = " + num3);


        System.out.println("--------------------------------------------");
        int amount =127 ; //cents
        int quarters = amount/25;
        int cents = amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        int cent =127;
        cent %=25;
        System.out.println("cent = " + cent);

        System.out.println("..............................");
        int y = 300;
        y %=16;
        System.out.println("y = " + y);

        System.out.println("--------------------------------");
        int balance = 3500;
        //insurance fee ; 153
        balance %= 153;
        System.out.println("balance = " + balance);















    }




}
