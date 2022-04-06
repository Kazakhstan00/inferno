package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends JPanel {

    private MainFrame parent;

    private JLabel namelabel;
    private JLabel surnamelabel;
    private JLabel facultylabel;
    private JLabel grouplabel;
    private JTextField NametextField;
    private JTextField SurnametextField;
    private JTextField GrouptextField;
    private JComboBox facultiesBox;
    private JButton back;
    private JButton ADD;
    private String[] faculties = new String[3];
    int cnt = 0;

    public AddStudent(MainFrame parent) {
        faculties[0] = "IT";
        faculties[1] = "Math";
        faculties[2] = "Economics";
        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        namelabel = new JLabel("Name:");
        namelabel.setSize(300, 30);
        namelabel.setLocation(100, 50);
        add(namelabel);

        surnamelabel = new JLabel("Surname:");
        surnamelabel.setSize(300, 30);
        surnamelabel.setLocation(100, 100);
        add(surnamelabel);

        facultylabel = new JLabel("Faculty:");
        facultylabel.setSize(300, 30);
        facultylabel.setLocation(100, 150);
        add(facultylabel);

        grouplabel = new JLabel("Group:");
        grouplabel.setSize(300, 30);
        grouplabel.setLocation(100, 200);
        add(grouplabel);

        NametextField = new JTextField();
        NametextField.setSize(300, 30);
        NametextField.setLocation(170, 50);
        add(NametextField);

        SurnametextField = new JTextField();
        SurnametextField.setSize(300, 30);
        SurnametextField.setLocation(170, 100);
        add(SurnametextField);

        facultiesBox = new JComboBox(faculties);
        facultiesBox.setSize(300, 30);
        facultiesBox.setLocation(170, 150);
        add(facultiesBox);

        GrouptextField = new JTextField();
        GrouptextField.setSize(300, 30);
        GrouptextField.setLocation(170, 200);
        add(GrouptextField);

        ADD = new JButton("Add");
        ADD.setSize(100, 30);
        ADD.setLocation(150, 400);
        add(ADD);
        ADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = NametextField.getText();
                String surname = SurnametextField.getText();
                String faculty = (String) facultiesBox.getSelectedItem();
                String group = GrouptextField.getText();
                if (!name.equals("") && !surname.equals("") && !group.equals("")) {
                    Student student = new Student(cnt + 1, name, surname, faculty, group);
                    parent.setStudent(student, cnt);

                    cnt++;
                    NametextField.setText("");
                    SurnametextField.setText("");
                    facultiesBox.setSelectedIndex(0);
                    GrouptextField.setText("");
                }
            }
        });

        back = new JButton("Back");
        back.setSize(100, 30);
        back.setLocation(300, 400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }
}