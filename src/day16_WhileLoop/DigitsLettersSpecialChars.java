package day16_WhileLoop;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School !@#$%Wooden Spoon";
        // 12345
        //CydeoWoodenSpoon
        //!@#$%
        String digits = "";
        String letters = "";
        String specialCh = "";

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (o to last)
            char ch = str.charAt(i);// to give you each of the characters(represent every single caracter from str
            if (ch >= '0' && ch <= '9') { // if the character is between '0' to '9' is digits(ascii table)
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') { // if the character is between 'A' TO 'Z', then is letter
                letters += ch;

            } else if (ch >= 'a' && ch <= 'z') {//if the character is between 'a' TO 'z', then is letter
                letters += ch;

            } else {// if the character is neither digit nor letter , then it's special character
                specialCh += ch;
                if (ch != ' ') { // if the special character is not a space
                    specialCh+=ch;
                }


                System.out.println("digits = " + digits);
                System.out.println("letters = " + letters);
                System.out.println("specialCh = " + specialCh);
                System.out.println("specialCh = " + specialCh);
            }


        }

    }
}
