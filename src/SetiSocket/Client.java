package SetiSocket;

import javax.xml.crypto.Data;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your name");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1",1998);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while(true) {
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");
                int a = in.nextInt();
                if (a == 1) {
                    System.out.println("Insert message:");
                    String message = in.next();
                    MessageData pd = new MessageData(name, message);
                    outputStream.writeObject(pd);


                } else if (a == 2) {
                    System.exit(0);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}