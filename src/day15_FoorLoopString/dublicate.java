package day15_FoorLoopString;
/*
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC
				Output:
					ABC
			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */
public class dublicate {
    public static void main(String[] args) {
        String word = "AABBCCBC";
        String result = "";
        for (int i = 0; i <= word.length() - 1; i++) { //i: represents all the index number ,starting from zero
            //daca folosim less or equal atunci adaugam -1 pentru lenghts
            String ch = "" + word.charAt(i);// represents char Character of word
            if (!result.contains(ch)) { // if the character is not contained in the result
                result += ch; // the character will be added in the result
            }
            System.out.println(result);

        }
    }
}
