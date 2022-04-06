package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ListStudent extends JPanel {

    private MainFrame parent;

    private JLabel label;
    private JButton back;

    private String header[] = {"Name","Surname","Group","id","Faculty"};
    private JTable table;
    private JScrollPane scrollPane;

    public ListStudent(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        label = new JLabel("SECOND PAGE");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);



        back = new JButton("Back");
        back.setSize(300,30);
        back.setLocation(100,150);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getSecondPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
        table = new JTable();
        table.setFont(new Font("Calibri", Font.PLAIN, 12));
        table.setRowHeight(30);


        scrollPane = new JScrollPane(table);
        scrollPane.setSize(300,200);
        scrollPane.setLocation(100,200);
        add(scrollPane);

    }
    public void generateTable(Student[] students){

        Object data[][] = new Object[students.length][5];

        for(int i =0;i<students.length;i++){
            data[i][0] = students[i].getId();
            data[i][1] = students[i].getName();
            data[i][2] = students[i].getSurname();
            data[i][3] = students[i].getGroup();
            data[i][4] = students[i].getFaculty();

        }

        DefaultTableModel model = new DefaultTableModel(data, header);
        table.setModel(model);

    }
}
