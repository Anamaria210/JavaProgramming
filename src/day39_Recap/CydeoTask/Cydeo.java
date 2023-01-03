package day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer= new Developer("Korkmaz",29,'M',1,"Java Developer",120000);
        Tester tester= new Tester("Ana",29,'F',2,"tester",100000);
        Teacher teacher= new Teacher("Daniel",32,'M',3,"Math Teacher",95000);
        Student student = new Student("Amel",34,'F',4,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);
         developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);
        System.out.println("-----------------------------------------------");
        developer.work();
        tester.work();
        teacher.work();
       // student.work();

        developer.fixingBugs();

        System.out.println("-----------------------------------------------");
        tester.eat();
        tester.drink();
        tester.sleep();


        System.out.println("-----------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("-----------------------------------------------");
        student.eat();
        student.drink();
        student.sleep();

        // student.fixingBugs();
        // student.createTicket();
        student.study();

    }
}
