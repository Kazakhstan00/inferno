package SetiPlusPotoki;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChatMenu extends JPanel {
    public MainFrame parent;
    public JTextField Textfield;
    public JButton Sendbutton;
    public ObjectOutputStream outputStream;
    public ObjectInputStream inputStream;
    public JButton Backbutton;


    public ChatMenu(MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        Textfield = new JTextField();
        Textfield.setSize(300,30);
        Textfield.setLocation(100,200);
        add(Textfield);


        Sendbutton = new JButton("SEND");
        Sendbutton.setSize(300,30);
        Sendbutton.setLocation(100,300);

        Sendbutton.addActionListener( e1 -> {
            String text = Textfield.getText();
            if(!text.equals("")){
                Textfield.setText("");
                MessageData mg = new MessageData(text);
                try{
                    outputStream.writeObject(mg);
                }
                catch (Exception exc){
                    exc.printStackTrace();
                }

            }
        });
        add(Sendbutton);

        Backbutton = new JButton("Back");
        Backbutton.setSize(300,30);
        Backbutton.setLocation(100,100);

        Backbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getChatMenu().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
        add(Backbutton);

    }

    public void setInputStream(ObjectInputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void setOutputStream(ObjectOutputStream outputStream) {
        this.outputStream = outputStream;
    }
}