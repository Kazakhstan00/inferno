package OOPnasledovaniePolimorfizm;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary){
        super(id, login, password,name, surname);
        this.salary=salary;
    }
    public Staff(){
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject=indexOfSubject+1;

    }
    public void getSubjects() {
        for (int i = 0; i < indexOfSubject; i++) {
            System.out.println(subjects[i]);
        }
    }

    @Override
    public  String getData(){
        return id+" "+login+" "+password+" "+name+" "+surname+" "+salary;
    }
}