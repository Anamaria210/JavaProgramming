package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1= new Employee("Tatiana",'F',27,100000);
        employee1.setAge(32);
        System.out.println(employee1);
        Employee employee2= new Employee("Aygun",'F',27,115000);
        employee2.setName("Julia");
        System.out.println(employee2);
        employee2.setSalary(employee2.getSalary()+15000);
        System.out.println(employee2);
    }
}
