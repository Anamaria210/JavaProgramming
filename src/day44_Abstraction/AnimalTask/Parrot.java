package day44_Abstraction.AnimalTask;

public final class Parrot extends Animal implements Playable,Flyable{
    public Parrot(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }
    public void play(){
        System.out.println(getName() + " ");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ "Can fly with 20km/h");
    }
}

