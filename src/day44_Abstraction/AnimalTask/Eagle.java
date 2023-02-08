package day44_Abstraction.AnimalTask;

public class Eagle extends Animal implements WildAnimal,Flyable {
    public Eagle(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }
    public void hunt(){
        System.out.println(getName() +" is hunting snake");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");

    }

    @Override
    public void fly() {
        System.out.println(getName() +" can fly 50km/h");
    }
}
