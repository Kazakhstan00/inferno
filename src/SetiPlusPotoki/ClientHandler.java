package SetiPlusPotoki;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler extends Thread {
    private Socket socket;
    private int id;

    public ClientHandler(Socket socket, int id) {
        this.id = id;
        this.socket = socket;
    }

    public void run() {
        try {
            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData response = null;
            while ((response = (MessageData) inStream.readObject()) != null) {

                System.out.println(response);

            }
        } catch (Exception e) {

        }

    }
}
