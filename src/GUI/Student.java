package GUI;

import javax.swing.*;

public class Student extends JFrame {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private String group;


    public Student(){
    }
    public Student(int id, String name, String surname,String faculty, String group){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.faculty=faculty;
        this.group=group;

    }
    public  String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGroup() {
        return group;
    }
    public int getId() {
        return id;
    }
    public String getFaculty() {
        return faculty;
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
    public void setId(int id) {
        this.id = id;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString(){
        return "Player{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", surname=" + surname +
                ", group='" + group + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}