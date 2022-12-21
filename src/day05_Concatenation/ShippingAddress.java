package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
     /*
        String name = James,
        String buildingNumber = 1123B; daca punem virrgula dupa James nu mai trebuie sa creem un alt string

*/

         String name = "Anamaria " ,
                 buildingAddress = "11821B",
                 streetName = "Jones Banch Dr",
                 ciy = "London" ,
                 state = "VA",
                 zipCode= "22031A";
String address = name + "\n" + buildingAddress + " " + streetName + "\n"+ ciy + " ," + state + " "  +zipCode;
        System.out.println(name + "\n" + buildingAddress + " " + streetName + "\n"+ ciy + " ," + state + " "  +zipCode);

        System.out.println(address);

    }

}






/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125

 */