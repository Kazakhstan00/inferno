package ArrayList;

public class Account {
    private int id;
    private String name;
    private String surname;
    private double balance;

    public Account(){
    }
    public Account(int id, String name, String surname, double balance){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return id+" "+name+" "+surname+" "+balance;
    }
}