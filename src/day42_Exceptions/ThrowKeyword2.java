package day42_Exceptions;

import day39_Recap.shapeTask.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {
       throw new NoSuchElementException("There is no such element as break");
      //  System.out.println("Hello World");
       // throw  new InterruptedException();

       // throw  new Rectangle(5,2);
    }
}
