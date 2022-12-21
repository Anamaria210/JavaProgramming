package day17_WhileLoopDoWhileLoop;

public class DoWhileloopIntro {
    public static void main(String[] args) {
        boolean a= false;
        for (int i = 0;  a; i++) {
            System.out.println("Wooden Spoon --- for loop");
        }
        while (a){
            System.out.println("Wooden Spoon--- While loop");
        }
        System.out.println("--------------------------");
        do {
            System.out.println("Wooden Spoon----do while loop");
        }while(a);

    }
}
