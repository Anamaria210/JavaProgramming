package day34_GarbageCollection_AccessModifiers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Circle {
    public double radius;
    public static double pi=3.14;
    public static String name="Circle";
    public static ArrayList<Integer>numbers;

    // public static Sheet sheet;

    public Circle(double radius){
        this.radius=radius;
        pi=3.14;
    }
    static{
        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

          /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);*/
    }
    }




