package MiniProject;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;
    public DBManager db;


    public ClientHandler(Socket socket, int id, DBManager db){
        this.id = id;
        this.socket = socket;
        this.db = db;
    }

    public void run(){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            PackageData response  = null;
            while ((response = (PackageData) inputStream.readObject()) != null) {
                if(response.getOperationType().equals("list_students")){
                    response.setStudents(db.getAllStudents());
                    outputStream.writeObject(response);
                }
                else if(response.getOperationType().equals("add_student")){
                    db.addStudent(response.getStudent());
                }
                else{
                    response.setOperationType("None");
                    outputStream.writeObject(response);
                }
            }
        }
        catch(Exception e){

        }

    }



}