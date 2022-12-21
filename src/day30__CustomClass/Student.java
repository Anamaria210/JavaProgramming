package day30__CustomClass;

public class Student {
   public String studentName;
    public char gender;
    public int age;
    public int ID;
    public char grade;
    public String name;

    public Student(String tahir, int i, char m, char b, int i1) {

    }

    public Student() {

    }

    public void setInfo(String studentName, char gender, int age, int ID, char grade) {
        this.studentName = studentName;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }
    /*=public void setInfo(String studentName, char gender, int age,int ID,char grade){
    this.studentName=studentName;
    this.gender=gender;
    this.age=age;
    this.ID=ID;
    this.grade=grade;*/


    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';


    }

    public void code(){
        System.out.println(studentName + " is coding");
    }

     public void sleep(){
         System.out.println(studentName +" is sleeping");
     }
}
