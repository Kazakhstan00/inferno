package MiniProject;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(1999);
            DBManager db = new DBManager();
            db.connect();
            int id = 0;
            while(true){
                Socket socket = server.accept();
                id++;
                System.out.println("Client #"+id+" connected");
                ClientHandler ch = new ClientHandler(socket, id,db);
                ch.start();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}