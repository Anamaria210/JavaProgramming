package day15_FoorLoopString;

public class Alphabet {
    public static void main(String[] args) {
        //A-Z ==>65-90
        for (int i = 65; i <= 90; i++) { //i: 65,67,68
            System.out.print((char) i + " ");
        }

        System.out.println("-------------------------------");
        for (char i = 'A'; i <= 'Z'; i++) { //i;A,B,C,D,F,G .....Z
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");

            for (int i1 = 90; i1 >= 65; i1--) {
                System.out.print(i1 + " ");

            }

        }

    }

}