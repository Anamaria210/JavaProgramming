package day27_WrapperClasses;

import java.util.Arrays;

/*
2. ReplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}

 */
public class replaceAll {
    public static void main(String[] args) {
       int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
      arr =replaceAll(arr,30,300);
        System.out.println(Arrays.toString(arr));

        arr = replaceAll(arr, 300, 500);

        System.out.println(Arrays.toString(arr));

    }
    public static int[]replaceAll(int[]array,int oldElement,int newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldElement){
                array[i]=newElement;
            }

        }
        return array;
    }
    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }


    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }


    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals( oldValue) ) {
                array[i] = newValue;
            }

        }

        return array;

    }




}

