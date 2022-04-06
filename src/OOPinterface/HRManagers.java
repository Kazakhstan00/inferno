package OOPinterface;

public class HRManagers implements Workers{
    private int id;
    private String fullName;
    private int salary;

    public HRManagers(){
    }
    public HRManagers(int id, String fullName, int salary){
        this.id=id;
        this.fullName=fullName;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return id+" "+fullName;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
