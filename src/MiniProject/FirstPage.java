package MiniProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FirstPage extends JPanel {

    private MainFrame parent;

    private JLabel namelabel;
    private JLabel surnamelabel;
    private JLabel agelabel;
    private JTextField NametextField;
    private JTextField SurnametextField;
    private JTextField AgetextField;
    private JButton back;
    private JButton ADD;
    public ObjectOutputStream outputStream;
    public ObjectInputStream inputStream;



    public FirstPage(MainFrame parent) {

        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        namelabel = new JLabel("Name:");
        namelabel.setSize(300,30);
        namelabel.setLocation(100,50);
        add(namelabel);

        surnamelabel = new JLabel("Surname:");
        surnamelabel.setSize(300,30);
        surnamelabel.setLocation(100,100);
        add(surnamelabel);

        agelabel = new JLabel("Age:");
        agelabel.setSize(300,30);
        agelabel.setLocation(100,150);
        add(agelabel);


        NametextField = new JTextField();
        NametextField.setSize(300,30);
        NametextField.setLocation(170,50);
        add(NametextField);

        SurnametextField = new JTextField();
        SurnametextField.setSize(300,30);
        SurnametextField.setLocation(170,100);
        add(SurnametextField);


        AgetextField = new JTextField();
        AgetextField.setSize(300,30);
        AgetextField.setLocation(170,150);
        add(AgetextField);

        ADD = new JButton("Add");
        ADD.setSize(100,30);
        ADD.setLocation(150,400);
        add(ADD);
        ADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = NametextField.getText();
                String surname = SurnametextField.getText();
                String age = AgetextField.getText();


                if(!name.equals("") && !surname.equals("") && !age.equals("")){
                    PackageData request = new PackageData();
                    request.setOperationType("add_student");
                    request.setStudent(new Students(null,name, surname, Integer.parseInt(age)));
                    try{
                        parent.getConnectionPage().outputStream.writeObject(request);
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                    NametextField.setText("");
                    SurnametextField.setText("");
                    AgetextField.setText("");
                }
            }
        });

        back = new JButton("Back");
        back.setSize(100,30);
        back.setLocation(300,400);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getFirstPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }

    public void setOutputStream(ObjectOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void setInputStream(ObjectInputStream inputStream) {
        this.inputStream = inputStream;
    }


}