package day41_Exceptions;

import day39_Recap.CydeoTask.EmployeeJava;

public class MultiCatchBlocks {
    public static void main(String[] args) {
        EmployeeJava employeeJava= null;
        try {
            employeeJava.getSalary();
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();

        }catch (ArithmeticException e ){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e ){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch(RuntimeException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("-----------------------------------");
        try{
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){

            e.printStackTrace();
        }


    }
}
