package SetiPlusPotoki;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MainMenu extends JPanel {
    public MainFrame parent;
    public JButton button;
    public JLabel IPlabel;
    public JLabel PORTlabel;
    public JTextField IPfield;
    public JTextField PORTfield;

    public MainMenu(MainFrame parent){
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        IPlabel = new JLabel("IP Address");
        IPlabel.setSize(300,30);
        IPlabel.setLocation(50,50);
        add(IPlabel);

        IPfield = new JTextField();
        IPfield.setSize(300,30);
        IPfield.setLocation(150,50);
        add(IPfield);

        PORTlabel = new JLabel("PORT");
        PORTlabel.setSize(300,30);
        PORTlabel.setLocation(50,100);
        add(PORTlabel);

        PORTfield = new JTextField();
        PORTfield.setSize(300,30);
        PORTfield.setLocation(150,100 );
        add(PORTfield);


        button = new JButton("CONNECT");
        button.setSize(300,30);
        button.setLocation(100,300);

        button.addActionListener(e -> {
            String IP = IPfield.getText();
            String port = PORTfield.getText();
            if(!IP.equals("") && !port.equals("")){
                IPfield.setText("");
                PORTfield.setText("");
                try{
                    Socket socket = new Socket(IP,Integer.parseInt(port));
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                    parent.getMainMenuPage().setVisible(false);
                    parent.getChatMenu().setVisible(true);

                    parent.getChatMenu().setOutputStream(outputStream);
                    parent.getChatMenu().setInputStream(inputStream);


                }
                catch (Exception exception){
                    exception.printStackTrace();
                }
            }






        });
        add(button);

    }
}