package MiniProject;

import javax.swing.*;

public class MainFrame extends JFrame {

    private MainMenu mainMenuPage;
    private FirstPage AddStudentPage;
    private SecondPage ListOfStudentsPage;
    private ConnectionPage connectionPage;



    public MainFrame(){


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENT Application");
        setSize(500,500);

        connectionPage = new ConnectionPage(this);
        connectionPage.setVisible(true);
        add(connectionPage);


        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(false);
        add(mainMenuPage);

        AddStudentPage = new FirstPage(this);
        AddStudentPage.setVisible(false);
        add(AddStudentPage);

        ListOfStudentsPage = new SecondPage(this);
        ListOfStudentsPage.setVisible(false);
        add(ListOfStudentsPage);




    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public FirstPage getFirstPage() {
        return AddStudentPage;
    }

    public SecondPage getSecondPage() {
        return ListOfStudentsPage;
    }

    public ConnectionPage getConnectionPage(){
        return connectionPage;
    }


}