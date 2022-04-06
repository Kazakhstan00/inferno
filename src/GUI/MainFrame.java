package GUI;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private AddStudent AddStudentPage;
    private ListStudent ListOfStudentsPage;
    public Student[] uni = new Student[10];

    public MainFrame() {
        for (int i = 0; i < uni.length; i++) {
            uni[i] = new Student();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENT Application");
        setSize(500, 500);


        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        AddStudentPage = new AddStudent(this);
        AddStudentPage.setVisible(false);
        add(AddStudentPage);

        ListOfStudentsPage = new ListStudent(this);
        ListOfStudentsPage.setVisible(false);
        add(ListOfStudentsPage);
    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public AddStudent getFirstPage() {
        return AddStudentPage;
    }

    public ListStudent getSecondPage() {
        return ListOfStudentsPage;
    }

    public void setStudent(Student student, int cnt) {
        uni[cnt] = student;
    }

    public Student[] getStudents() {
        return uni;
    }
}