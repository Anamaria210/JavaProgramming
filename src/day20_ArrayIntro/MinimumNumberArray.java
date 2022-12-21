package day20_ArrayIntro;

public class MinimumNumberArray {
    public static void main(String[] args) {
        int[]numbers ={10,15,2,70};
        int minimum= numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<minimum){// if there is any element in the array that's sma
                minimum=numbers[i]; // smaller number will be assigned to the variable min


        }

        }

        System.out.println(minimum);

    }

}
