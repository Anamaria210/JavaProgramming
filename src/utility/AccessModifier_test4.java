package utility;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_test4 extends ProtectedAccessModifier{
    public static void main(String[] args) {
        System.out.println(AccessModifier_test4.name2); // protected is visible outside the package is subClass only
       // System.out.println(AccessModifier_test4.name1);
        AccessModifier_test4.method2();
        // AccessModifier_test4.method1();
    }
}

