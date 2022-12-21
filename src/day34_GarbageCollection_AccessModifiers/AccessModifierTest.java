package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.StaticMembers.method;

public class AccessModifierTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
      //  System.out.println(AccessModifiers.privateData);// private is not visible outside the class
        AccessModifiers.method1();
        AccessModifiers.method();
      //  AccessModifiers.method3();// private is not visible outsideClass
    }
}

