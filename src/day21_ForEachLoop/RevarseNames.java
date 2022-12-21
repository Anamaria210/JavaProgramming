package day21_ForEachLoop;

public class RevarseNames {
    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String name : names) { // each represent every single name
            String reversed ="";
            for (int i = name.length()-1; i >=0; i--) { // reverse the string
               reversed+= name.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
