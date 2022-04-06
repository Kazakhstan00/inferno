package MiniProject;

import java.io.Serializable;

public class Students implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private int age;

    public Students(){}
    public Students(Long id, String name, String surname, int age){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return id+" "+name+" "+surname+" "+age;
    }
}