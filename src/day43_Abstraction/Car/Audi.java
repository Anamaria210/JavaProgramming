package day43_Abstraction.Car;

public final class Audi extends Car {
    @Override
    public void startCar() {
        System.out.println("Push the start button");

    }

    public void autoPark(){
        System.out.println(getBrand() + getModel() +" Has auto park feature");
    }


    public Audi( String model, String color, int year, double price) {
        super("Audi ", model, color, year, price);


    }
}

