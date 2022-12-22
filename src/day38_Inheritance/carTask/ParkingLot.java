package day38_Inheritance.carTask;

public class ParkingLot { // has a relation
    public static void main(String[] args) {
        Toyota toyota= new Toyota("Camry",2020,2000,"grey",123456);
        Tesla tesla=new Tesla("S",2022,94990,"red",0);
        BMW bmw= new BMW("X5",2020,67350,"black",12000);

          tesla.start();
          bmw.start();
          toyota.start();

    }

}
