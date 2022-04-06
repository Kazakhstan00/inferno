package OOPnasledovaniePolimorfizm;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student(int id, String login, String password, String name, String surname,double gpa){
        this.gpa=gpa;
    }
    public Student(){
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    public void addCourse(String course){
        courses[indexOfCourses]=course;
        indexOfCourses = indexOfCourses +1;
    }
    public void getCourses(){
        for(int i = 0;i<indexOfCourses;i++){
            System.out.println(courses[i]);
        }
    }
    @Override
    public String getData(){
        return id+" "+login+" "+password+" "+name+" "+surname+" "+gpa;
    }
}