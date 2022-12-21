package day36_Inheritance.Encapsulation;

public class Student {
    private String name;
    private  int age;
    private char gender,grade;
    private char gradeSchool;
    private String schoolName;
    public static boolean isStudent=true;
    public static boolean isHuman=true;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<=5|| age>=90){
            return;
        }
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setGender(char gender) {
        this.gender = gender;
        if(!(gender=='F' || gender=='M')){
            return;
        }
    }

    public void setGradeSchool(char gradeSchool) {
        if( !( grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') ){
            return; // exits the method

    }
        this.gradeSchool = gradeSchool;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void study(){
        System.out.println(name+ " is studying");
    }

    public Student(String name, int age, char gender, char grade, char gradeSchool) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGradeSchool(gradeSchool);
        setSchoolName(schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", gradeSchool=" + gradeSchool +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public char getGradeSchool() {
        return gradeSchool;
    }
}
