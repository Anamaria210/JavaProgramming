package utility;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData);//default is not visible outside the package
       // System.out.println(AccessModifiers.privateData);// private access modifier is not visible outside of class
        AccessModifiers.method1();
        //AccessModifiers.method();
        //AccessModifiers.method3();
    }
}
