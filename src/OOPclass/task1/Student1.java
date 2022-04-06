package OOPclass.task1;

public class Student1 {
    String name;
    String surname;
    double gpa;

    public Student1() {
    }

    public Student1(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }


    public String getStudentData(){
        return name+" "+surname+" "+gpa;
    }
}