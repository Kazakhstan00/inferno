package OOPabstracs;

public class Student extends User {
    String name;
    String surname;
    String group;
    double gpa;

    public Student(){
    }
    public Student(String name, String surname, String group, double gpa){
        this.name=name;
        this.surname=surname;
        this.group=group;
        this.gpa=gpa;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGroup() {
        return group;
    }
    public double getGpa() {
        return gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    String getUserData() {
        return name+" "+surname+" "+group+" "+gpa;
    }
}