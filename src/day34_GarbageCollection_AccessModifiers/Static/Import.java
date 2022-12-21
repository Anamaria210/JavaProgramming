package day34_GarbageCollection_AccessModifiers.Static;
import day34_GarbageCollection_AccessModifiers.Circle;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;
public class Import {
    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(Circle.pi);
    }
}
