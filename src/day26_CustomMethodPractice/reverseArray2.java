package day26_CustomMethodPractice;

import utility.ArraysUtility;

public class reverseArray2 {
    public static int[] reverse (int[]array){
        int[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
         result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

}
