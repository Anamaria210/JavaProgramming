package day43_Abstraction.Car;

public final class Tesla extends Car {
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void startCar() {
        System.out.println("Say \"start\"");
    }

    public void autopilot(){
        System.out.println(getBrand()+ getModel()+ " has auto pilot feature");
    }
}
