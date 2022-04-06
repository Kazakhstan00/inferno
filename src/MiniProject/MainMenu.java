package MiniProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;

    private JButton AddStudentButton;
    private JButton ListOfStudentsButton;
    private JButton exitButton;



    public MainMenu(MainFrame parent) {


        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        AddStudentButton = new JButton("Add Student");
        AddStudentButton.setSize(300,30);
        AddStudentButton.setLocation(100,100);
        add(AddStudentButton);
        AddStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getFirstPage().setVisible(true);

            }
        });

        ListOfStudentsButton = new JButton("List of Students");
        ListOfStudentsButton.setSize(300,30);
        ListOfStudentsButton.setLocation(100,150);
        add(ListOfStudentsButton);
        ListOfStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getMainMenuPage().setVisible(false);
                parent.getSecondPage().setVisible(true);
                parent.getSecondPage().generateTable();


            }
        });

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }


}