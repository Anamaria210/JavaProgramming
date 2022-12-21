package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");

        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("----------------------------------------");
        for (int j = 0; j < 4; j++) { // practic prima conditie imi va repeta de 4 ori a doua
            for (int i = 0; i <5 ; i++) { // Nestead loop means a loop inside on another loop
                System.out.println("Wooden Spoon");
            }

        }





    }
}
