package day44_Abstraction.AnimalTask;

public final class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }


    @Override
    public void hunt() {
        System.out.println(getName() + " hunts deer");
    }
}



