package day40_FinalKeyword;

import day31_Constructors.BankAccount;

public final class Dog extends Animal{

    public Dog(String name, String bread, char gender, String color, String size, int age) {
        super(name, bread, gender, color, size, age);
    }

    //eating dog food

    @Override
    public void eat() {
        System.out.println(getName() + " eating dog food");
    }
     public void bark(){
         System.out.println(getName() + " is barking");
     }

    }



