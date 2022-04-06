package OOPclass.task1;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student() {
    }

    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }


    public String getStudentData(){
        return id+" "+name+" "+surname+" "+gpa;
    }
}